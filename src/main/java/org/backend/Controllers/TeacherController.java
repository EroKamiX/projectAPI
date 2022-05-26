package org.backend.Controllers;

import org.backend.Models.*;
import org.backend.Service.*;
import org.json.JSONArray;
import org.json.JSONObject;
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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.zip.DataFormatException;

@Controller
@RequestMapping(value = "/Teacher")
public class TeacherController {
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
    baiTapService bts;

    @Autowired
    chamDiemService cds;

    @Autowired
    studentBaiTapService sbts;

    @Autowired
    fileService fs;

    @Autowired
    svLopQLService svqls;

    @Autowired
    getServiceVoVan gsvv;
    public class baiTapNop {
        int id;
        String masv;
        String username;
        String name;
        List<String> fileName;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getMasv() {
            return masv;
        }

        public void setMasv(String masv) {
            this.masv = masv;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public  List<String> getFileName() {
            return fileName;
        }

        public void setFileName(List<String> fileName) {
            this.fileName = fileName;
        }
    }

    public class fileNop {
        int id;
        String username;
        String fileName;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }
    }

    @RequestMapping("/index")
    public String index(ModelMap map, @RequestParam("monhoc") String xhcn) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        AccountDTO acd = accountService.getByUserName(username);
        List<MonDTO> sdtl = new ArrayList<>();
        List<loptinchiDTO> cdtol = new ArrayList<>();
        if (acd.getStudentId() == null) {
            giangVienDTO gvd = teacherService.getById(acd.getTeacherId());
            List<loptinchiDTO> ltcd = classesService.getAll();
            for (loptinchiDTO ltd : ltcd) {
                if (ltd.getMaGV().equals(acd.getTeacherId())) {
                    MonDTO sdto = subjectsService.getById(ltd.getIdMon());
//                    loptinchiDTO cdt = classesService.getById(ltd.getId());
                    sdtl.add(sdto);
//                    cdtol.add(cdt);
                    cdtol.add(ltd);
                }
            }
            map.addAttribute("urlToClasse", "Teacher");
            map.addAttribute("name", gvd.getTenGV());
        } else {
            SinhVienDTO svd = studentService.getById(acd.getStudentId());
            map.addAttribute("urlToClasse", "Student");
            map.addAttribute("name", svd.getTenSV());
        }
        map.addAttribute("subjectList", sdtl);
        map.addAttribute("classList", cdtol);
        map.addAttribute("monhoc", xhcn);
        map.addAttribute("lopql");
        map.addAttribute("username", username);
        return "teacher-index";
    }

    @RequestMapping(value = "/Profile", method = RequestMethod.GET)
    public String profile(ModelMap map, HttpServletRequest request) throws IOException {
        request.setCharacterEncoding("UTF-8");
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        AccountDTO acd = accountService.getByUserName(username);
        giangVienDTO gvd = teacherService.getById(acd.getTeacherId());
////        String email = jsonObject.getString("username");
        map.addAttribute("url", "Teacher");
//        map.addAttribute("updateContext", requestContext + "/updateTeacherProfile");
        map.addAttribute("username", username);
        map.addAttribute("lsDTO", gvd);
        return "user_profile";
    }
//
////    @RequestMapping(value = "/Update", method = RequestMethod.POST)
////    public String update(ModelMap map, HttpServletRequest request, @RequestParam("name") String name, @RequestParam("age") int age, @RequestParam("phone") String phone, @RequestParam("address") String address) throws IOException{
////        String id = (String) session.getAttribute("id");
////        String requestContext = request.getContextPath();
////        String requestServerName = request.getServerName();
////        int requestServerPort = request.getServerPort();
////        String s = "http://" + requestServerName + ":" + requestServerPort + requestContext + "/update";
////        HttpClient httpClient = HttpClients.createDefault();
////        HttpPost httpPost = new HttpPost(s);
////        List<NameValuePair> params = new ArrayList<NameValuePair>(2);
////        params.add(new BasicNameValuePair("name", name));
////        params.add(new BasicNameValuePair("id", id));
////        params.add(new BasicNameValuePair("address", address));
////        params.add(new BasicNameValuePair("sdt", phone));
////        httpPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
////        try (CloseableHttpClient httpCl = HttpClients.createDefault();
////             CloseableHttpResponse response = httpCl.execute(httpPost)) {
////
////            System.out.println(EntityUtils.toString(response.getEntity()));
////        }
////        return "login";
////    }

    @RequestMapping(value = "suaBaiTap", method = RequestMethod.GET)
    public String suaBaiTap(ModelMap map, @RequestParam(value = "id") int id) {
        baiTapDTO btd = bts.getById(id);
        List<filesDTO> fdt = gsvv.getFileByBaiTapId(id);
        map.addAttribute("baiTap", btd);
        map.addAttribute("files", fdt);
        return "updateBaiTap";
    }

    @RequestMapping(value = "/addBaiTap", method = RequestMethod.GET)
    public String baiTap(@RequestParam(value = "success", required = false) String success, HttpServletRequest request, ModelMap map, @RequestParam(value = "className", required = false) String className, @RequestParam(value = "classID", required = false) String classID) throws IOException {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        List<MonDTO> sdtl = new ArrayList<>();
        List<loptinchiDTO> cdtol = new ArrayList<>();
         AccountDTO acd = accountService.getByUserName(username);
        List<loptinchiDTO> ltd = classesService.getAll();
        for (loptinchiDTO ld : ltd) {
            if (ld.getMaGV().equals(acd.getTeacherId())) {
                MonDTO sdto = subjectsService.getById(ld.getIdMon());
//                    loptinchiDTO cdt = classesService.getById(ltd.getId());
                sdtl.add(sdto);
//                    cdtol.add(cdt);
                cdtol.add(ld);
            }
        }
        map.addAttribute("classesDT", cdtol);
        map.addAttribute("subjectsDT", sdtl);
        map.addAttribute("username", username);
        if (success != null) {
            map.addAttribute("success", "Yes");
        }
        return "add-baiTap";
    }

    @RequestMapping(value = "/giaoVienChamDiem")
    public RedirectView chamDiem(@RequestParam("id") int id, @RequestParam("thangDiem") int thangDiem, @RequestParam("Diem") int diem, @RequestParam("masv") String[] masv) {
        for (String msv : masv) {
            chamDiemDTO cdt = new chamDiemDTO();
            cdt.setBaitapid(id);
            cdt.setDiem(diem);
            cdt.setThangDiem(thangDiem);
            cdt.setStudentId(msv);
            cds.insert(cdt);
        }
        return new RedirectView("chamDiem?id=" + id + "&success=true");
    }

    @RequestMapping(value = "/chamDiem")
    public String chamDiem(@RequestParam(value = "success", required = false) String success, ModelMap map, HttpServletRequest request, @RequestParam(value = "id", required = false) int id, @RequestParam(value = "loptinchi", required = false) String loptinchi) throws IOException {
        List<studentBaiTapDTO> stbtd = sbts.getByBaiTapId(id);
        List<baiTapNop> fileNops1 = new ArrayList<>();
        int thangDiem = bts.getById(id).getThangDiem();
        int i = 0;
        for (studentBaiTapDTO stbt : stbtd) {
            AccountDTO acd = accountService.getByUserName(stbt.getUsername());
            SinhVienDTO svd = studentService.getById(acd.getStudentId());
            baiTapNop fn = new baiTapNop();
            fn.setId(i);
            fn.setUsername(stbt.getUsername());
            fn.setName(svd.getTenSV());
            fn.setMasv(svd.getMasv());
            List<String> lsfn = new ArrayList();
            for (filesDTO flsdt : fs.getAll()) {
                if (stbt.getId() == flsdt.getNopBaiTapId()) {
                    lsfn.add(flsdt.getFilename());
                }
            }	
            fn.setFileName(lsfn);
            fileNops1.add(fn);
            i += 1;
        }
        if (success != null) {
            map.addAttribute("success", "Yes");
        }
        map.addAttribute("loptinchi", loptinchi);
        map.addAttribute("baiTapid", id);
        map.addAttribute("thangDiem", thangDiem);
        map.addAttribute("baitapnop", fileNops1);
        map.addAttribute("urlToClasse", "Teacher");
        return "chamDiem";
    }

    @RequestMapping(value = "/uploadBaiTap", method = RequestMethod.POST)
    public RedirectView uploadBaiTap(@RequestParam(value = "thangDiem") int thangDiem, @RequestParam(value = "loptinchi") String loptinchi, @RequestParam("thangDiem") int thangdiem, @RequestParam(value = "deadline") String deadline, @RequestParam("files") MultipartFile[] files, @RequestParam(value = "tenBaiTap") String tenbaitap, @RequestParam(value = "noiDungBaiTap") String noiDungBaiTap) throws IOException {
        baiTapDTO btd = new baiTapDTO();
        filesDTO fdt = new filesDTO();
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        btd.setUsername(username);
        btd.setDeadline(deadline);
        btd.setTenBaiTap(tenbaitap);
        btd.setNoiDungBaiTap(noiDungBaiTap);
        btd.setLoptinchi(loptinchi);
        btd.setThangDiem(thangDiem);
        bts.insert(btd);

        String uploadDir = "/home/phat/Documents/projectAPI/uploads/" + loptinchi + "/BaiTap";

        Path uploadPath = Paths.get(uploadDir);

        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }

        for (MultipartFile file : files) {
            fdt.setFilename(file.getOriginalFilename());
            try (InputStream inputStream = file.getInputStream()) {
                Path filePath = uploadPath.resolve(file.getOriginalFilename());
                Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
            fdt.setBaiTapId(bts.getLastId());
            fdt.setNopBaiTapId(0);
            fs.insert(fdt);
            System.out.println(file.getOriginalFilename());
        }
        return new RedirectView("addBaiTap?success=true");
    }

    @RequestMapping(value = "/Class")
    public String Class(ModelMap map, @RequestParam("loptinchi") String loptinchi) {
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
            for (loptinchiDTO ltd : classesService.getAll()) {
                if (ltd.getId().equals(loptinchi)) {
                    if (ltd.getMaGV().equals(acd.getTeacherId())) {
                        monhoc = ltd.getIdMon();
                        for (baiTapDTO btd : bts.getAll()) {
                            if (btd.getLoptinchi().equals(ltd.getId())) {
//                                System.out.println("sai username");
                                btdt.add(btd);
                            }
                        }
                        MonDTO sdto = subjectsService.getById(ltd.getIdMon());
//                    loptinchiDTO cdt = classesService.getById(ltd.getId());
                        sdtl.add(sdto);
//                    cdtol.add(cdt);
                        cdtol.add(ltd);
                    } else {
                        if (acd != null) {
                            map.addAttribute("message", "Hi " + acd.getUsername()
                                    + "<br> You do not have permission to access this page!");
                        } else {
                            map.addAttribute("msg",
                                    "You do not have permission to access this page!");
                        }
                        return "/403page";
                    }
                }
            }
            map.addAttribute("urlToClasse", "Teacher");
            map.addAttribute("name", teacherService.getById(acd.getTeacherId()).getTenGV());
        } else {
            map.addAttribute("urlToClasse", "Student");
            map.addAttribute("name", studentService.getById(acd.getStudentId()).getTenSV());
        }

        map.addAttribute("subjectList", sdtl);
        map.addAttribute("classList", cdtol);
        map.addAttribute("baiTapLists", btdt);
        map.addAttribute("username", username);
        map.addAttribute("classId", loptinchi);
        map.addAttribute("monhoc", monhoc);
        return "baiTap";
    }

    @RequestMapping("/hienThiSinhVien")
    public String hienThiSV(ModelMap map, @RequestParam("loptinchi") String id, @RequestParam("monhoc") String monhoc) {
        List<SinhVienDTO> stl = new ArrayList<>();
        for (dkTinChiDTO dtcd : learningService.getAll()) {
            if (dtcd.getIdLopTC().equals(id)) {
                stl.add(studentService.getById(dtcd.getMaSV()));
            }
        }
        map.addAttribute("baitapnop", stl);
        map.addAttribute("classId", id);
        map.addAttribute("monhoc", monhoc);
        map.addAttribute("urlToClasse", "Teacher");
        return "hienThiSinhVien";
    }

    @RequestMapping(value = "/baiTap", method = RequestMethod.GET, produces = "text/plain;charset=UTF-8")
    public String addBaiTap(ModelMap map, HttpServletRequest request) throws IOException, ParseException {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        int id = Integer.parseInt(request.getParameter("id"));
        baiTapDTO btd = bts.getById(id);
        List<filesDTO> fdt = new ArrayList<>();
        for (filesDTO fd : fs.getAll()) {
            if (fd.getBaiTapId() == id) {
                fdt.add(fd);
            }
        }
        final String new_format = "dd-MM-yyyy";
        final String old_format = "yyyy-MM-dd";
        String old_dateS = btd.getDeadline();
        String newStringDate = "";
        SimpleDateFormat sdf = new SimpleDateFormat(old_format);
        try {
            Date d = sdf.parse(old_dateS);
            sdf.applyPattern(new_format);
            newStringDate = sdf.format(d);
        } catch (Exception dfe) {
            dfe.printStackTrace();
        }
        map.addAttribute("loptinchi", btd.getLoptinchi());
        map.addAttribute("urlToClasse", "Teacher");
        map.addAttribute("myFile", fdt);
        map.addAttribute("tenBaiTap", btd.getTenBaiTap());
        map.addAttribute("denHan", newStringDate);
        map.addAttribute("noiDungBaiTap", btd.getNoiDungBaiTap());
        map.addAttribute("id", id);
        map.addAttribute("username", username);
        return "BaiTapDisplay";
    }
//
    @RequestMapping(value = "diem")
    public String hienThiDiem(ModelMap map, @RequestParam("id") int id) {
        List<SinhVienDTO> studentDTOS = new ArrayList<>();
        List<chamDiemDTO> chamDiemDTOS = new ArrayList<>();
        for (chamDiemDTO cddt : cds.getAll()) {
            if (cddt.getBaitapid() == id) {
                studentDTOS.add(studentService.getById(cddt.getStudentId()));
                chamDiemDTOS.add(cds.getById(cddt.getId()));
            }
        }

        map.addAttribute("baiTapid", id);
        map.addAttribute("urlToClasse", "Teacher");
        map.addAttribute("diems", chamDiemDTOS);
        map.addAttribute("studentdtos", studentDTOS);
        return "hienThiDiem";
    }
}
