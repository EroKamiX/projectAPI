package org.backend.Controllers;

import org.backend.Models.baiTapDTO;
import org.backend.Models.filesDTO;
import org.backend.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;

@RestController
public class TeacherRestController {
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
//        bts.insert(btd);

//        String uploadDir = "\\home\\phat\\Documents\\projectAPI\\uploads\\" + loptinchi + "\\BaiTap";
//
//        Path uploadPath = Paths.get(uploadDir);
//
//        if (!Files.exists(uploadPath)) {
//            Files.createDirectories(uploadPath);
//        }

        for (MultipartFile file : files) {
            fdt.setFilename(file.getOriginalFilename());
//            try (InputStream inputStream = file.getInputStream()) {
//                Path filePath = uploadPath.resolve(file.getOriginalFilename());
//                Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            fdt.setBaiTapId(bts.getLastId());
//            fdt.setNopBaiTapId(0);
//            fs.insert(fdt);
            System.out.println(file.getOriginalFilename());
        }
        return new RedirectView("Teacher/addBaiTap?success=true");
    }
}
