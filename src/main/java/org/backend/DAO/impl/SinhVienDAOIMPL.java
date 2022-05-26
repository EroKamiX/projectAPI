package org.backend.DAO.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.SinhVienDAO;
import org.backend.Entity.SinhVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class SinhVienDAOIMPL implements SinhVienDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<SinhVien> getAll() {
		// TODO Auto-generated method stub
		String sql = "Select * from sinhvien2";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<SinhVien>>() {
			@Override
			public List<SinhVien> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<SinhVien> ls = new ArrayList<>();
				while (rs.next()) {
					SinhVien sv = new SinhVien();
					sv.setMasv(rs.getString("msv"));
					sv.setTenSV(rs.getString("tensv"));
					sv.setKhoa(rs.getString("idkhoa"));
					sv.setKhoaHoc(rs.getString("idkhoahoc"));
					sv.setQuequan(rs.getString("quequan"));
					sv.setAvatar(rs.getString("avatar"));
					sv.setStatus(rs.getInt("STATUS"));
					sv.setBirthday(rs.getString("birthday"));
					sv.setCreated_by(rs.getString("created_by"));
					sv.setCreated_at(rs.getString("created_at"));
					sv.setUpdated_at(rs.getString("updated_at"));
					ls.add(sv);
				}
				return ls;
			}
		});
	}

	@Override
	public boolean insert(SinhVien sv) {
		// TODO Auto-generated method stub
		String sql = "Insert into sinhvien2 (`msv`, `tensv`,`idkhoahoc`,`idkhoa`,`quequan`,`avatar`,`STATUS`,`birthday`,`created_by`) values (?,?,?,?,?,?,?,?,?)";
		return jdbcTemplate.update(sql, sv.getMasv(), sv.getTenSV(), sv.getKhoaHoc(), sv.getKhoa(), sv.getQuequan(), sv.getAvatar(), sv.getStatus(), sv.getBirthday(), sv.getCreated_by()) > 0;
	}

	@Override
	public boolean delete(String masv) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(SinhVien sv, String masv) {
		// TODO Auto-generated method stub
		String sql = "Update sinhvien2 set tensv = ?, idkhoahoc = ?, idkhoa = ?, quequan = ?, avatar = ?, STATUS = ?, birthday = ?, created_by = ? where msv = ?";
		return jdbcTemplate.update(sql, sv.getTenSV(), sv.getKhoaHoc(), sv.getKhoa(), sv.getQuequan(), sv.getAvatar(), sv.getStatus(), sv.getBirthday(), sv.getCreated_by(), masv) > 0;
	}

	@Override
	public List<SinhVien> getById(String masv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SinhVien getBySinhVienid(String masv) {
		// TODO Auto-generated method stub
		String sql = "Select * from sinhvien2 where msv = ?";
		return jdbcTemplate.query(sql, new ResultSetExtractor<SinhVien>() {
			@Override
			public SinhVien extractData(ResultSet rs) throws SQLException, DataAccessException {
				SinhVien sv = new SinhVien();
				while (rs.next()) {
					sv.setMasv(rs.getString("msv"));
					sv.setTenSV(rs.getString("tensv"));
					sv.setKhoa(rs.getString("idkhoa"));
					sv.setKhoaHoc(rs.getString("idkhoahoc"));
					sv.setQuequan(rs.getString("quequan"));
					sv.setAvatar(rs.getString("avatar"));
					sv.setStatus(rs.getInt("STATUS"));
					sv.setBirthday(rs.getString("birthday"));
					sv.setCreated_by(rs.getString("created_by"));
					sv.setCreated_at(rs.getString("created_at"));
					sv.setUpdated_at(rs.getString("updated_at"));
				}
				return sv;
			}
		}, masv);
	}

	@Override
	public SinhVien getByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SinhVien> getByClassId(String classId) {
		// TODO Auto-generated method stub
		return null;
	}

}
