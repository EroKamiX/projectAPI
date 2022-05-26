package org.backend.Controllers;

import org.backend.Entity.Account;
import org.backend.Models.*;
import org.backend.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AccountController {
	@Autowired
    AccountService accountService;

    @Autowired
    monService subjectsService;

    @Autowired
    giangVienService teacherService;

    @Autowired
    svLopQLService slqservice;

    @Autowired
    loptinchiService lopHocService;

    @Autowired
    SinhVienService studentService;

    @Autowired
    dkTinChiService dtcs;

    @Autowired
    svLopQLService svlqs;

    @Autowired
    getServiceVoVan gsvv;

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
        for (dkTinChiDTO bdt : dtcs.getAll()) {
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

    @RequestMapping(value = "/login")
    public String login(@RequestParam(value = "error", required = false) String error,
                        @RequestParam(value = "logout", required = false) String logout,
                        ModelMap model) throws ServletException, IOException {
        String errorMessge = null;
        if (error != null) {
            errorMessge = "Username or Password is incorrect !!";
        }
        if (logout != null) {
            errorMessge = "You have been successfully logged out !!";
        }
        model.addAttribute("errorMessage", errorMessge);
        return "signIn";
    }

    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String accessDenied(Model model, Account account) {

        if (account != null) {
            model.addAttribute("message", "Hi " + account.getUsername()
                    + "<br> You do not have permission to access this page!");
        } else {
            model.addAttribute("msg",
                    "You do not have permission to access this page!");
        }
        return "403page";
    }

    @RequestMapping("/error")
    public String error() {
        return "error";
    }

    @RequestMapping("/index")
    public String index(ModelMap map) throws ParseException {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        AccountDTO acd = accountService.getByUserName(username);
        List<MonDTO> sdtl = new ArrayList<>();
        List<loptinchiDTO> cdtol = new ArrayList<>();
        if (acd.getStudentId() == null) {
            giangVienDTO gvd = teacherService.getById(acd.getTeacherId());
        	List<loptinchiDTO> ltcd = lopHocService.getAll();
            for (loptinchiDTO ld : ltcd) {
                if (ld.getMaGV().equals(gvd.getMagv())) {
                    MonDTO sdto = subjectsService.getById(ld.getIdMon());
                    sdtl.add(sdto);
                    cdtol.add(ld);
                }
            }
            map.addAttribute("urlToClasse", "Teacher");
            map.addAttribute("name", gvd.getTenGV());
        } else {
        	SinhVienDTO std = studentService.getById(acd.getStudentId());
            svLopQLDTO slqd = new svLopQLDTO();
            for (svLopQLDTO slqdt : svlqs.getAll()) {
                if (slqdt.getMasv().equals(std.getMasv())) {
                    slqd = slqdt;
                }
            }
            List<dkTinChiDTO> dktcd = dtcs.getAll();
            for (dkTinChiDTO ld : dktcd) {
                if (std.getMasv().equals(ld.getMaSV())) {
                    loptinchiDTO cdt = lopHocService.getById(ld.getIdLopTC());
                    for (MonDTO mdto : subjectsService.getAll()) {
                        if (cdt.getIdMon().equals(mdto.getId())) {
                            sdtl.add(mdto);
                        }
                    }
                    cdtol.add(cdt);
                }
            }
            map.addAttribute("urlToClasse", "Student");
            map.addAttribute("name", std.getTenSV());
            map.addAttribute("classStudent", slqd.getMaLopQL());
        }
        map.addAttribute("notification", checkHetHan());
        map.addAttribute("subjectList", sdtl);
        map.addAttribute("classList", cdtol);
        map.addAttribute("username", username);
        return "index";
    }
}
