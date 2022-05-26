package org.backend.DAO;

import java.util.List;

import org.backend.Entity.SinhVien;
import org.springframework.stereotype.Repository;

public interface SinhVienDAO {
	List<SinhVien> getAll();
	boolean insert(SinhVien sv);
	boolean delete(String masv);
	boolean update(SinhVien sv, String masv);
	List<SinhVien> getById(String masv);
	SinhVien getBySinhVienid(String masv);
	SinhVien getByUserName(String username);
	List<SinhVien> getByClassId(String classId);
}
