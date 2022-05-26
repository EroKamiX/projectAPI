package org.backend.Controllers;

import org.backend.Models.*;
import org.backend.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

@Controller
@RequestMapping("/Student")
public class StudentControllers {
    @Autowired
    baiTapService bts;

    @Autowired
    AccountService accountService;

    @Autowired
    monService subjectsService;

    @Autowired
    giangVienService teacherService;

    @Autowired
    dkTinChiService learningService;

    @Autowired
    loptinchiService classesService;

    @Autowired
    SinhVienService studentService;

    @Autowired
    chamDiemService cds;

    @Autowired
    fileService fs;

    @Autowired
    getServiceVoVan gsvv;

    @Autowired
    studentBaiTapService sbts;

    //hàm ko liên quan tới mapping

    public class notificationBaiTap {
        int idbaiTap;
        String tenbaiTap;
        String deadline;

        public int getIdbaiTap() {
            return idbaiTap;
        }

        public void setIdbaiTap(int idbaiTap) {
            this.idbaiTap = idbaiTap;
        }

        public String getTenbaiTap() {
            return tenbaiTap;
        }

        public void setTenbaiTap(String tenbaiTap) {
            this.tenbaiTap = tenbaiTap;
        }

        public String getDeadline() {
            return deadline;
        }

        public void setDeadline(String deadline) {
            this.deadline = deadline;
        }
    }

    public List<notificationBaiTap> checkHetHan() throws ParseException {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        AccountDTO acd = accountService.getByUserName(username);
        List<notificationBaiTap> ls1 = new ArrayList<>();
        for (dkTinChiDTO bdt : learningService.getAll()) {
            if (bdt.getMaSV().equals(acd.getStudentId())) {
                notificationBaiTap nbt = new notificationBaiTap();
                baiTapDTO btdt = gsvv.getByNotification(bdt.getIdLopTC(), username);
                if (btdt.getId() != 0) {
                    nbt.setTenbaiTap(btdt.getTenBaiTap());
                    nbt.setIdbaiTap(btdt.getId());
                    nbt.setDeadline(btdt.getDeadline());
                    ls1.add(nbt);
                }
            }
        }
        return ls1;
    }
//    @RequestMapping("/Profile")
//    public String profile(ModelMap map, HttpServletRequest request) throws IOException {
//        request.setCharacterEncoding("UTF-8");
//        String username = SecurityContextHolder.getContext().getAuthentication().getName();
//        map.addAttribute("username", username);
//        String s = "http://localhost:8080/projectAPI_war/getTeacher";
//        URL url = new URL(s);
//
//        Scanner sc = new Scanner(url.openStream(), "UTF-8");
//        String str = new String();
//        while (sc.hasNext()) {
//            str += sc.nextLine();
//        }
//        sc.close();
//        List<TeacherDTO> lsdto = new ArrayList<>();
//        JSONArray jsonArray = new JSONArray(str);
//        for (int i = 0; i < jsonArray.length(); i++) {
//            TeacherDTO tc = new TeacherDTO();
//            JSONObject obj = jsonArray.getJSONObject(i);
//            tc.setId(obj.getString("id"));
//            tc.setName(obj.getString("name"));
//            tc.setAge(obj.getInt("age"));
//            tc.setAddress(obj.getString("address"));
//            tc.setSdt(obj.getString("sdt"));
//            lsdto.add(tc);
//        }
//        for (TeacherDTO tc : ls) {
//            map.addAttribute("name", tc.getName());
//        }
//        map.addAttribute("lsDTO", lsdto);
//        return "teacher-index";
//    }

    @RequestMapping(value = "/baiTap", method = RequestMethod.GET, produces = "text/plain;charset=UTF-8")
    public String addBaiTap(@RequestParam(value = "success", required = false) String success, ModelMap map, HttpServletRequest request) throws IOException, ParseException {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        AccountDTO acd = accountService.getByUserName(username);
        int id = Integer.parseInt(request.getParameter("id"));
        baiTapDTO btd = bts.getById(id);
        final String new_format = "dd-MM-yyyy";
        final String old_format = "yyyy-MM-dd";
        String old_dateS = btd.getDeadline();
        String newStringDate = "";
        SimpleDateFormat sdf = new SimpleDateFormat(old_format);
        Date current = new Date();
        Date deadline = sdf.parse(btd.getDeadline());
        if (current.compareTo(deadline) > 0) {
            map.addAttribute("hethan", "true");
        }
        List<filesDTO> fdt = new ArrayList<>();
        for (filesDTO fd : fs.getAll()) {
            if (fd.getBaiTapId() == id) {
                fdt.add(fd);
            }
        }
        studentBaiTapDTO sbtd = gsvv.getByUserNameAndLopTinChiSBT(username, id);
        if (sbtd.getUsername() != null) {
            List<filesDTO> lsf = new ArrayList<>();
            for (filesDTO fd : fs.getAll()) {
                if (fd.getNopBaiTapId() == sbtd.getId()) {
                    lsf.add(fd);
                }
            }
            map.addAttribute("filesdto", lsf);
        }
        try {
            Date d = sdf.parse(old_dateS);
            sdf.applyPattern(new_format);
            newStringDate = sdf.format(d);
        } catch (Exception dfe) {
            dfe.printStackTrace();
        }
        map.addAttribute("notification", checkHetHan());
        map.addAttribute("role", "STUDENT");
        map.addAttribute("myFile", fdt);
        map.addAttribute("tenBaiTap", btd.getTenBaiTap());
        map.addAttribute("denHan", newStringDate);
        map.addAttribute("noiDungBaiTap", btd.getNoiDungBaiTap());
        map.addAttribute("id", id);
        map.addAttribute("username", username);
        map.addAttribute("urlToClasse","Student");
        return "BaiTapDisplay";
    }

//    @RequestMapping("/index")
//    public String index(ModelMap map, @RequestParam("monhoc") String xhcn) {
//        String username = SecurityContextHolder.getContext().getAuthentication().getName();
//        AccountDTO acd = accountService.getByUserName(username);
//        StudentDTO std = studentService.getByUser(username);
//        List<SubjectsDTO> sdtl = new ArrayList<>();
//        List<ClassesDTO> cdtol = new ArrayList<>();
//        if (acd.getStudentId() == null) {
//            List<LearningDTO> ltd = learningService.getByTeacherId(acd.getTeacherId());
//            for (LearningDTO ld : ltd) {
//                SubjectsDTO sdto = subjectsService.getBySingleId(ld.getIdMon());
//                ClassesDTO cdt = classesService.getBySingleId(ld.getClassId());
//                sdtl.add(sdto);
//                cdtol.add(cdt);
//            }
//            map.addAttribute("urlToClasse", "Teacher");
//            map.addAttribute("name", teacherService.getByUser(username).getName());
//        } else {
//            List<LearningDTO> ltd = learningService.getByClassId(std.getClassId());
//            for (LearningDTO ld : ltd) {
//                SubjectsDTO sdto = subjectsService.getBySingleId(ld.getIdMon());
//                ClassesDTO cdt = classesService.getBySingleId(ld.getClassId());
//                sdtl.add(sdto);
//                cdtol.add(cdt);
//            }
//            map.addAttribute("urlToClasse", "Student");
//            map.addAttribute("name", studentService.getByUser(username).getName());
//        }
//        map.addAttribute("subjectList", sdtl);
//        map.addAttribute("classList", cdtol);
//        map.addAttribute("monhoc", xhcn);
//        map.addAttribute("username", username);
//        return "student-index";
//    }

    @RequestMapping(value = "/Class")
    public String Class(ModelMap map, @RequestParam("loptinchi") String loptinchi) throws ParseException {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        AccountDTO acd = accountService.getByUserName(username);
        String monhoc = "";
        List<MonDTO> sdtl = new ArrayList<>();
        List<loptinchiDTO> cdtol = new ArrayList<>();
        List<baiTapDTO> btdt = new ArrayList<>();
        if (acd.getStudentId() == null) {
//            List<LearningDTO> ltd = learningService.getByTeacherId(acd.getTeacherId());
//            for (LearningDTO ld : ltd) {
//                SubjectsDTO sdto = subjectsService.getBySingleId(ld.getIdMon());
//                ClassesDTO cdt = classesService.getBySingleId(ld.getClassId());
//                sdtl.add(sdto);
//                cdtol.add(cdt);
//            }
            map.addAttribute("urlToClasse", "Teacher");
            map.addAttribute("name", teacherService.getById(acd.getTeacherId()).getTenGV());
        } else {
            boolean isInClass = false;
            for (dkTinChiDTO dtcd : learningService.getAll()) {
                if (dtcd.getMaSV().equals(acd.getStudentId())) {
                    if (dtcd.getIdLopTC().equals(classesService.getById(loptinchi).getId())) {
                        isInClass = true;
                    }
                }
            }

            if (isInClass == false) {
                return "403page";
            }
//            List<Date> dates = new ArrayList();

            for (loptinchiDTO ltd : classesService.getAll()) {
                if (ltd.getId().equals(loptinchi)) {
                        monhoc = ltd.getIdMon();
                        for (baiTapDTO btd : bts.getAll()) {
                            if (btd.getLoptinchi().equals(ltd.getId())) {
                                btdt.add(btd);
                            }
                        }
                        MonDTO sdto = subjectsService.getById(ltd.getIdMon());
//                    loptinchiDTO cdt = classesService.getById(ltd.getId());
                        sdtl.add(sdto);
//                    cdtol.add(cdt);
                        cdtol.add(ltd);
                }
                map.addAttribute("urlToClasse", "Student");
                map.addAttribute("name", studentService.getById(acd.getStudentId()).getTenSV());
            }
//        map.addAttribute("subjectList", sdtl);
//        map.addAttribute("classList", cdtol);
        }
        map.addAttribute("notification", checkHetHan());
        map.addAttribute("subjectList", sdtl);
        map.addAttribute("classList", cdtol);
        map.addAttribute("baiTapLists", btdt);
        map.addAttribute("username", username);
        map.addAttribute("classId", loptinchi);
        map.addAttribute("monhoc", monhoc);
        return "baiTap";
    }

    @RequestMapping("/hienThiSinhVien")
    public String hienThiSV(ModelMap map, @RequestParam("id") String id) throws ParseException {
        List<SinhVienDTO> svds = new ArrayList<>();
        loptinchiDTO ltcd = classesService.getById(id);
        dkTinChiDTO dtcdt = new dkTinChiDTO();
        for (dkTinChiDTO dtcd : learningService.getAll()) {
            if (ltcd.getId().equals(dtcd.getIdLopTC())) {
                dtcdt = dtcd;
            }
        }
        for (SinhVienDTO svdt : studentService.getAll()) {
            if (svdt.getMasv().equals(dtcdt.getMaSV())) {
                svds.add(svdt);
            }
        }
        map.addAttribute("notification", checkHetHan());
        map.addAttribute("baitapnop", svds);
        map.addAttribute("classId", id);
        map.addAttribute("monhoc", ltcd.getIdMon());
        map.addAttribute("urlToClasse", "Student");
        return "hienThiSinhVien";
    }

    @RequestMapping(value = "diem")
    public String hienThiDiem(ModelMap map, @RequestParam("id") int id) throws ParseException {
        List<chamDiemDTO> chamDiemDTOS = new ArrayList<>();
        for (chamDiemDTO cdto : cds.getAll()) {
            if (cdto.getBaitapid() == id) {
                chamDiemDTOS.add(cdto);
            }
        }
        List<SinhVienDTO> studentDTOS = new ArrayList<>();
        for (chamDiemDTO cdt : chamDiemDTOS) {
            SinhVienDTO stdo = studentService.getById(cdt.getStudentId());
            studentDTOS.add(stdo);
        }
        map.addAttribute("notification", checkHetHan());
        map.addAttribute("diems", chamDiemDTOS);
        map.addAttribute("studentdtos", studentDTOS);
        return "hienThiDiem";
    }

    @RequestMapping(value = "/nopBaiTap", method = RequestMethod.POST)
    public RedirectView nopBaiTap(@RequestParam(name = "files", required = false) MultipartFile[] files, @RequestParam(name = "id") int id, @RequestParam(name = "link", required = false) String link) throws IOException {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
//        System.out.println(files.length);
        studentBaiTapDTO stbd = new studentBaiTapDTO();
        baiTapDTO btd = bts.getById(id);
        filesDTO filesDTO = new filesDTO();
        stbd.setUsername(username);
        stbd.setLienket(link);
        stbd.setBaiTapId(id);
        sbts.insertWithFile(stbd);
        String uploadDir = "C:\\Users\\phatn\\eclipse-workspace\\projectAPI\\uploads\\" + btd.getLoptinchi() + "\\hocsinh";

        Path uploadPath = Paths.get(uploadDir);

        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }

        for (MultipartFile file : files) {
//            filename.add(file.getOriginalFilename());
            filesDTO.setFilename(file.getOriginalFilename());
            try (InputStream inputStream = file.getInputStream()) {
                Path filePath = uploadPath.resolve(file.getOriginalFilename());
                System.out.println(filePath.toFile().getAbsolutePath());
                Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
            filesDTO.setBaiTapId(0);
            filesDTO.setNopBaiTapId(sbts.getLastId());
            fs.insert(filesDTO);
        }

        return new RedirectView("baiTap?id="+id+"&success=true");
    }
}