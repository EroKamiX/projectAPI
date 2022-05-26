package org.backend.DAO.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.monDAO;
import org.backend.Entity.Mon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class monDAOIMPL implements monDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Mon> getAll() {
		// TODO Auto-generated method stub
		String sql = "Select * from mon";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<Mon>>() {
			@Override
			public List<Mon> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Mon> ls = new ArrayList<>();
				while (rs.next()) {
					Mon mn = new Mon();
					mn.setId(rs.getString("id"));
					mn.setTenMon(rs.getString("tenMon"));
					mn.setKhoa(rs.getString("idKhoa"));
					mn.setSoTinChi(rs.getInt("soTinChi"));
					mn.setSoTietHoc(rs.getInt("soTietHoc"));
					mn.setStatus(rs.getInt("STATUS"));
					mn.setCreated_by(rs.getString("created_by"));
					mn.setCreated_at(rs.getString("created_at"));
					mn.setUpdated_at(rs.getString("updated_at"));
					ls.add(mn);
				}
				return ls;
			}
		});
	}

	@Override
	public boolean insert(Mon mn) {
		// TODO Auto-generated method stub
		String sql = "Insert into mon (`id`,`tenMon`,`idKhoa`,`soTinChi`,`soTietHoc`,`STATUS`,`created_by`) values (?,?,?,?,?,?,?)";
		return jdbcTemplate.update(sql, mn.getId(), mn.getTenMon(), mn.getKhoa(), mn.getSoTinChi(), mn.getSoTietHoc(), mn.getCreated_by()) > 0;
	}

	@Override
	public boolean update(Mon mn, String id) {
		// TODO Auto-generated method stub
		String sql = "Update mon set tenMon = ?, idKhoa = ?, soTinChi = ?, soTietHoc = ?, STATUS = ?, created_by = ? where id = ?";
		return jdbcTemplate.update(sql, mn.getTenMon(), mn.getKhoa(), mn.getSoTinChi(), mn.getSoTietHoc(), mn.getCreated_by(), id) > 0;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Mon getById(String id) {
		// TODO Auto-generated method stub
		String sql = "Select * from mon where id = ?";
		return jdbcTemplate.query(sql, new ResultSetExtractor<Mon>() {
			@Override
			public Mon extractData(ResultSet rs) throws SQLException, DataAccessException {
				Mon mn = new Mon();
				while (rs.next()) {
					mn.setId(rs.getString("id"));
					mn.setTenMon(rs.getString("tenMon"));
					mn.setKhoa(rs.getString("idKhoa"));
					mn.setSoTinChi(rs.getInt("soTinChi"));
					mn.setSoTietHoc(rs.getInt("soTietHoc"));
					mn.setStatus(rs.getInt("STATUS"));
					mn.setCreated_by(rs.getString("created_by"));
					mn.setCreated_at(rs.getString("created_at"));
					mn.setUpdated_at(rs.getString("updated_at"));
				}
				return mn;
			}
		}, id);
	}

}
