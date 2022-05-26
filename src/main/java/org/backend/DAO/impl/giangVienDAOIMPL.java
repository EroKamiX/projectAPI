package org.backend.DAO.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.giangVienDAO;
import org.backend.Entity.giangVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class giangVienDAOIMPL implements giangVienDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<giangVien> getAll() {
		// TODO Auto-generated method stub
		String sql = "Select * from giangVien";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<giangVien>>() {
			@Override
			public List<giangVien> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<giangVien> ls = new ArrayList();
				while (rs.next()) {
					giangVien gv = new giangVien();
					gv.setMagv(rs.getString("mgv"));
					gv.setTenGV(rs.getString("tenGV"));
					gv.setKhoa(rs.getString("idKhoa"));
					gv.setIdBangCap(rs.getInt("idBangCap"));
					gv.setQuequan(rs.getString("quequan"));
					gv.setAvatar(rs.getString("avatar"));
					gv.setStatus(rs.getInt("STATUS"));
					gv.setBirthday(rs.getString("birthday"));
					gv.setCreated_by(rs.getString("created_by"));
					gv.setCreated_at(rs.getString("created_at"));
					gv.setUpdated_at(rs.getString("updated_at"));
					ls.add(gv);
				}
				return ls;
			}
		});
	}

	@Override
	public boolean insert(giangVien gv) {
		// TODO Auto-generated method stub
		String sql = "Insert into giangVien (`mgv`,`tenGV`,`idKhoa`,`idBangCap`,`quequan`,`avatar`,`STATUS`,`birthday`,`created_by`) values (?,?,?,?,?,?,?,?,?)";
		return jdbcTemplate.update(sql, gv.getMagv(), gv.getTenGV(), gv.getKhoa(), gv.getIdBangCap(), gv.getQuequan(), gv.getAvatar(), gv.getStatus(), gv.getBirthday(), gv.getCreated_by()) > 0;
	}

	@Override
	public boolean update(String mgv, giangVien gv) {
		// TODO Auto-generated method stub
		String sql = "Update giangVien set tenGV = ?, idKhoa = ?, idBangCap = ?, quequan = ?, avatar = ?, STATUS = ?, birthday = ?, created_by = ? where mgv = ?";
		return jdbcTemplate.update(sql, gv.getTenGV(), gv.getKhoa(), gv.getIdBangCap(), gv.getQuequan(), gv.getAvatar(), gv.getStatus(), gv.getBirthday(), gv.getCreated_by(), mgv) > 0;
	}

	@Override
	public boolean delete(String mgv) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public giangVien getById(String mgv) {
		String sql = "Select * from giangVien where mgv = ?";
		return jdbcTemplate.query(sql, new ResultSetExtractor<giangVien>() {
			@Override
			public giangVien extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				giangVien gv = new giangVien();
				while (rs.next()) {
					gv.setMagv(rs.getString("mgv"));
					gv.setTenGV(rs.getString("tenGV"));
					gv.setKhoa(rs.getString("idKhoa"));
					gv.setIdBangCap(rs.getInt("idBangCap"));
					gv.setQuequan(rs.getString("quequan"));
					gv.setAvatar(rs.getString("avatar"));
					gv.setStatus(rs.getInt("STATUS"));
					gv.setBirthday(rs.getString("birthday"));
					gv.setCreated_by(rs.getString("created_by"));
					gv.setCreated_at(rs.getString("created_at"));
					gv.setUpdated_at(rs.getString("updated_at"));
				}
				return gv;
			}
		}, mgv);
	}

	@Override
	public giangVien getByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
