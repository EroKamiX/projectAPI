package org.backend.Controllers;

import org.backend.Models.*;
import org.backend.Service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class AdminController {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Autowired
	lopQLService lopqlService;
	
	@Autowired
	svLopQLService svlopqlservice;
	
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
    khoaService khoaservice;
    
    @Autowired
    bangCapSevice bangcap_sv;
    public class AccountFull extends AccountDTO{
    	String fullname;

		public String getFulName() {
			return fullname;
		}

		public void setFulName(String fulName) {
			fullname = fulName;
		}

		public AccountFull() {
			super();
			// TODO Auto-generated constructor stub
		}

		public AccountFull(String username, String password, String teacherId, String studentId, String authority,
				boolean enabled,String fullname) {
			super(username, password, teacherId, studentId, authority, enabled);
			// TODO Auto-generated constructor stub
			this.fullname = fullname;
		}
    	
    }
    public class TeacherFull extends giangVienDTO{
    	private String tenBangCap;
    	private String TenKhoa;
		public String getTenBangCap() {
			return tenBangCap;
		}
		public void setTenBangCap(String tenBangCap) {
			this.tenBangCap = tenBangCap;
		}
		public String getTenKhoa() {
			return TenKhoa;
		}
		public void setTenKhoa(String tenKhoa) {
			TenKhoa = tenKhoa;
		}
		public TeacherFull() {
			super();
			// TODO Auto-generated constructor stub
		}
		public TeacherFull(int id, String magv, String tenGV, String khoa, int idBangCap, String quequan, String avatar,
				int status, String created_by, String created_at, String updated_at) {
			super(id, magv, tenGV, khoa, idBangCap, quequan, avatar, status, created_by, created_at, updated_at);
			// TODO Auto-generated constructor stub
		}
    	
    	
    }
    
    public class StudentFull extends SinhVienDTO {
    	private String tenKhoa;
    	private String idLopql;
		public String getTenKhoa() {
			return tenKhoa;
		}

		public void setTenKhoa(String tenKhoa) {
			this.tenKhoa = tenKhoa;
		}

		public String getIdLopql() {
			return idLopql;
		}

		public void setIdLopql(String idLopql) {
			this.idLopql = idLopql;
		}

		public StudentFull() {
			super();
			// TODO Auto-generated constructor stub
		}

		public StudentFull(int id, String masv, String tenSV, String khoaHoc, String khoa, String quequan,
				String avatar, int status, String created_by, String created_at, String updated_at) {
			super(id, masv, tenSV, khoaHoc, khoa, quequan, avatar, status, created_by, created_at, updated_at);
			// TODO Auto-generated constructor stub
		}
    	
    }
    
    public int sql_query_count (String sql) {
    	return jdbcTemplate
                .queryForObject(sql, Integer.class);
    }
    
    @RequestMapping(value = "/admin/index", method = RequestMethod.GET)
    public String index(ModelMap model) {
        List<giangVienDTO> list = teacherService.getAll();
//        for (giangVienDTO giangVienDTO : list) {
//			System.out.println(giangVienDTO.getAge());
//			System.out.println(giangVienDTO.getName());
//			System.out.println(giangVienDTO.getAddress());
//			System.out.println(giangVienDTO.getPicture());
//			System.out.println(giangVienDTO.getSdt());
//		}
        model.addAttribute("listTeacher", list);
        return "backend";
    }
    // Teacher

    @RequestMapping(value = "/admin/teachers", method = RequestMethod.GET)
    public String teachers(@RequestParam(value = "message", required = false) String message, ModelMap model) {
        List<giangVienDTO> listDTO = teacherService.getAll();
        List<TeacherFull> list = new ArrayList<TeacherFull>();
        for (giangVienDTO giangVienDTO : listDTO) {
        	TeacherFull teacher = new TeacherFull();
			khoaDTO khoadto = khoaservice.getById(giangVienDTO.getKhoa());
			bangCapDTO bangcapdto = bangcap_sv.getById(String.valueOf(giangVienDTO.getIdBangCap()));
			teacher.setTenBangCap(bangcapdto.getTenBangCap());
			teacher.setTenKhoa(khoadto.getTenKhoa());
			teacher.setMagv(giangVienDTO.getMagv());
			teacher.setTenGV(giangVienDTO.getTenGV());
			teacher.setQuequan(giangVienDTO.getQuequan());
			teacher.setAvatar(giangVienDTO.getAvatar());
			teacher.setAvatar(giangVienDTO.getAvatar());
			teacher.setStatus(giangVienDTO.getStatus());
			list.add(teacher);
		}
        model.addAttribute("listTeacher", list);
        model.addAttribute("message", message);
        return "teacher/index";
    }


    @RequestMapping(value = "/admin/teachers/add", method = RequestMethod.GET)
    public String add_teachers(ModelMap model) {

        model.addAttribute("giangVienDTO", new giangVienDTO());
        return "table_teacher_add";
    }
    @RequestMapping(value = "/admin/teachers/add_action", method = RequestMethod.POST)
    public String add_action_teachers(@ModelAttribute("addTeacher") giangVienDTO giangVienDTO, ModelMap model) {
        String error = "Something Wrong!";
        try {
            teacherService.insert(giangVienDTO);
            error = "Add Success";
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        model.addAttribute("message", error);
        return "redirect:/admin/teachers";
//		return "table_teacher_add";
    }
    @RequestMapping(value = "/admin/teachers/update", method = RequestMethod.GET)
    public String update_teachers(@ModelAttribute("addTeacher") giangVienDTO giangVienDTO,
                                  @RequestParam(value = "id", required = false) String id,ModelMap model) {
        String error = "Something Wrong!";
        if (id == null) {
            error = "Where is my id ?";
            model.addAttribute("message", error);
            return "redirect:/admin/teachers";
        }
        else {
        	error = "Nothing Here";
           

        }
        model.addAttribute("message", error);
        return "table_teacher_update";
    }
    @RequestMapping(value = "/admin/teachers/update_action/{id}", method = RequestMethod.POST)
    public String update_action_teachers(@PathVariable("id") String id,giangVienDTO giangVienDTO, ModelMap model) {
        String error = "Something Wrong!";
        try {
            error = "Update Success";
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        model.addAttribute("message", error);
        return "redirect:/admin/teachers";
//		return "table_teacher_update";
    }
    @RequestMapping(value = "/admin/teachers/delete", method = RequestMethod.GET)
    public String delete_action_teachers(@RequestParam(value = "id", required = false) String id, ModelMap model) {
        String error = "Something Wrong!";
        if (id == null) {
            error = "Where is my id ?";
        } else {
        	 error = "Nothing here";
        }
        
        model.addAttribute("message", error);
        return "redirect:/admin/teachers";
//		return "table_teacher_add";
    }

    // end teacher



    //user
    @RequestMapping(value = "/admin/users", method = RequestMethod.GET)
    public String user(@RequestParam(value = "message", required = false) String message, ModelMap model) {
        try {
        	
        	List<AccountDTO> listUser = accountService.getAll();
            List<AccountFull> listAccount = new ArrayList<AccountFull>();
            for (AccountDTO accountDTO : listUser) {
            	AccountFull accountFull = new AccountFull();
            	accountFull.setUsername(accountDTO.getUsername());
            	accountFull.setAuthority(accountDTO.getAuthority());
            	accountFull.setEnabled(accountDTO.isEnabled());
            	try {
					
            		if (accountDTO.getStudentId() != null) {
            			SinhVienDTO svDTO = studentService.getById(accountDTO.getStudentId());
            			accountFull.setFulName(svDTO.getTenSV());
            		}
            		else if (accountDTO.getTeacherId() != null) {
            			giangVienDTO gvDTO = teacherService.getById(accountDTO.getTeacherId());
            			accountFull.setFulName(gvDTO.getTenGV());
            		}
            		else {
            			accountFull.setFulName(null);
            		}
				} catch (Exception e) {
					// TODO: handle exception
					
					
					System.out.println(e);
				}
            	listAccount.add(accountFull);
			}
            model.addAttribute("message", message);
            model.addAttribute("listUser", listAccount);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

        return "user/index";
    }
    @RequestMapping(value = "/admin/users/add", method = RequestMethod.GET)
    public String add_user(ModelMap model) {
        List<SinhVienDTO> listSinhVienDTO = studentService.getAll();
        List<giangVienDTO> listTeacher = teacherService.getAll();
        List<AccountDTO> listUser = accountService.getAll();
        List<String> listRoles = new ArrayList<>();
        listRoles.add("ADMIN");
        listRoles.add("TEACHER");
        listRoles.add("STUDENT");
        model.addAttribute("listUser", listUser);
        model.addAttribute("listRoles", listRoles);
        model.addAttribute("listTeacher", listTeacher);
        model.addAttribute("listStudent", listSinhVienDTO);
        model.addAttribute("userDTO", new AccountDTO());
        return "user/add";
    }
    public String passwordEncoder(String password) {
        String hash = BCrypt.hashpw(password, BCrypt.gensalt(12));
        return hash;
    }
    @RequestMapping(value = "/admin/users/add_action", method = RequestMethod.POST)
    public String add_action_user(@ModelAttribute ("userDTO")AccountDTO accountDTO, ModelMap model) {
        String error = "Something Wrong!";
        try {
//				System.out.println(learningDTO.getId());
//				System.out.println(learningDTO.getClassId());
            if (accountDTO.getTeacherId()== "") {
                accountDTO.setTeacherId(null);
            }
            if (accountDTO.getStudentId()== "") {
                accountDTO.setStudentId(null);
            }
            accountDTO.setPassword(passwordEncoder(accountDTO.getPassword()));
            accountService.insert(accountDTO);
            accountService.insertAuthorities(accountDTO.getUsername(),accountDTO.getAuthority());
            error = "Add Success";
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        model.addAttribute("message", error);
        return "redirect:/admin/users";
//			return "table_teacher_add";
    }
    //end user
    
 // Student

    @RequestMapping(value = "/admin/students", method = RequestMethod.GET)
    public String students(@RequestParam(value = "message", required = false) String message, ModelMap model) {
        List<SinhVienDTO> listDTO = studentService.getAll();
        List<StudentFull> list = new ArrayList<StudentFull>();
        for (SinhVienDTO sv : listDTO) {
        	StudentFull svdt = new StudentFull();
        	khoaDTO khoadto = khoaservice.getById(sv.getKhoa());
        	svLopQLDTO svlopqlDTP = svlopqlservice.getById(sv.getMasv());
			svdt.setId(sv.getId());
			svdt.setTenSV(sv.getTenSV());
			svdt.setIdLopql(svlopqlDTP.getMaLopQL());
			svdt.setMasv(sv.getMasv());
			svdt.setKhoa(khoadto.getTenKhoa());
			svdt.setKhoaHoc(sv.getKhoaHoc());
			svdt.setQuequan(sv.getQuequan());
			svdt.setAvatar(sv.getAvatar());
			svdt.setStatus(sv.getStatus());
			svdt.setBirthday(sv.getBirthday());
			svdt.setCreated_by(sv.getCreated_by());
			svdt.setCreated_at(sv.getCreated_at());
			svdt.setUpdated_at(sv.getUpdated_at());
			list.add(svdt);
		}
        model.addAttribute("listStudents", list);
        model.addAttribute("message", message);
        return "students/index";
    }
    @RequestMapping(value = "/admin/students/add", method = RequestMethod.GET)
    public String showAddSinhVien(@RequestParam(value = "message", required = false) String message, ModelMap model) {
        List<khoaDTO> khoadto = khoaservice.getAll();
        model.addAttribute("message", message);
        model.addAttribute("khoaDTO", khoadto);
        model.addAttribute("sinhvienDTO", new SinhVienDTO());
        return "students/add";
    }
    @RequestMapping(value = "/admin/students/add_action", method = RequestMethod.POST)
    public String addAction(@ModelAttribute("sinhvienDTO") SinhVienDTO sinhvienDTO, ModelMap model) {
        
        SinhVienDTO svDTO  = sinhvienDTO;
        String sql = "Select COUNT(*) From sinhvien2 where idkhoa='"+svDTO.getKhoa()+"' AND idkhoahoc='"+svDTO.getKhoaHoc()+"'";
        int soluong = sql_query_count(sql);
        final String old_format = "yyyy-MM-dd";
        final String format_insert = "dd-MM-yyyy";
        final String format_password = "ddMMyyyy";
        SimpleDateFormat formatter = new SimpleDateFormat(old_format);
        String password = "";
        try {
        	Date date = formatter.parse(svDTO.getBirthday());
        	formatter.applyPattern(format_password);
        	password = formatter.format(date);
        	formatter.applyPattern(format_insert);
        	svDTO.setBirthday(formatter.format(date));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Loi Ne");
		}
        NumberFormat nf4 = new DecimalFormat("0000");
        svDTO.setMasv(svDTO.getKhoaHoc()+ svDTO.getKhoa() +nf4.format(soluong+1));
        svDTO.setStatus(1);
        studentService.insert(svDTO);
        accountService.insert(new AccountDTO(svDTO.getMasv(),new BCryptPasswordEncoder().encode(svDTO.getMasv()+password),null,svDTO.getMasv(),"STUDENT",true));
        accountService.insertAuthorities(svDTO.getMasv(), "STUDENT");
        return "redirect:/admin/students";
    }
 // LopQL
    
    public class lopQLfull extends lopQLDTO {
		private String tenGV;
		private int soluong;
		public String getTenGV() {
			return tenGV;
		}
		public void setTenGV(String tenGV) {
			this.tenGV = tenGV;
		}
		public int getSoluong() {
			return soluong;
		}
		public void setSoluong(int soluong) {
			this.soluong = soluong;
		}
	}
    
    @RequestMapping(value = "/admin/lopql", method = RequestMethod.GET)
    public String lopql(@RequestParam(value = "message", required = false) String message, ModelMap model) {
        List<lopQLDTO> listDTO = lopqlService.getAll();
        List<lopQLfull> list = new ArrayList<lopQLfull>();
        String sql = "Select count(*) from svlopql where malopql = '";
        for (lopQLDTO lql : listDTO) {
        	lopQLfull lqlFul = new lopQLfull();
        	giangVienDTO gvDTO = teacherService.getById(lql.getMGV());
        	sql +=  lql.getId() + "'";
        	//svLopQLDTO svlopqlDTP = svlopqlservice.getById(lqlFul.getId());
        	lqlFul.setSoluong(sql_query_count(sql));
        	lqlFul.setTenGV(gvDTO.getTenGV());
			lqlFul.setId(lql.getId());
			lqlFul.setTenLop(lql.getTenLop());
			lqlFul.setKhoa(lql.getKhoa());
			lqlFul.setKhoaHoc(lql.getKhoaHoc());
			lqlFul.setMGV(lql.getMGV());
			lqlFul.setStatus(lql.getStatus());
			lqlFul.setCreated_by(lql.getCreated_by());
			lqlFul.setCreated_at(lql.getCreated_at());
			lqlFul.setUpdated_at(lql.getUpdated_at());
			list.add(lqlFul);
		}
        model.addAttribute("listLopQL", list);
        model.addAttribute("message", message);
        return "classes/index";
    }
   
    
    
    //Môn học
    @RequestMapping(value = "/admin/monhoc", method = RequestMethod.GET)
    public String monhocIndex(@RequestParam(value = "message", required = false) String message, ModelMap model) {
    	List<Object> list_obj = new ArrayList<Object>();
        System.out.println(list_obj);
    	List<MonDTO> list = subjectsService.getAll();
        
        model.addAttribute("listMon", list);
        model.addAttribute("message", message);
        return "subjects/index";
    }
   
}
