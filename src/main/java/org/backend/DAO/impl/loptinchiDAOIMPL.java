package org.backend.DAO.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.loptinchiDAO;
import org.backend.Entity.loptinchi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class loptinchiDAOIMPL implements loptinchiDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<loptinchi> getAll() {
		// TODO Auto-generated method stub
		String sql = "Select * from loptinchi";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<loptinchi>>() {
			@Override
			public List<loptinchi> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<loptinchi> ls = new ArrayList<>();
				while (rs.next()) {
					loptinchi ltc = new loptinchi();
					ltc.setId(rs.getString("id"));
					ltc.setTenLopTC(rs.getString("TenLopTC"));
					ltc.setIdKhoa(rs.getString("idKhoa"));
					ltc.setIdKhoaHoc(rs.getString("idKhoaHoc"));
					ltc.setIdMon(rs.getString("idMon"));
					ltc.setMaGV(rs.getString("MaGV"));
					ltc.setStatus(rs.getInt("status"));
					ltc.setCreated_by(rs.getString("created_by"));
					ltc.setCreated_at(rs.getString("created_at"));
					ltc.setUpdated_at(rs.getString("updated_at"));
					ls.add(ltc);
				}
				return ls;
			}
		});
	}

	@Override
	public boolean insert(loptinchi ltc) {
		// TODO Auto-generated method stub
		String sql = "Insert into loptinchi (`id`,`TenLopTC`,`idKhoa`,`idKhoaHoc`,`idMon`,`MaGV`,`status`,`created_by`) values (?,?,?,?,?,?,?,?)";
		return jdbcTemplate.update(sql, ltc.getId(), ltc.getTenLopTC(), ltc.getIdKhoa(), ltc.getIdKhoaHoc(), ltc.getIdMon(), ltc.getMaGV(), ltc.getStatus(), ltc.getCreated_by()) > 0;
	}

	@Override
	public boolean update(String id, loptinchi ltc) {
		// TODO Auto-generated method stub
		String sql = "Update loptinchi set TenLopTC = ?, idKhoa = ?, idKhoaHoc = ?, idMon = ?, MaGV = ?, status = ?, created_by = ? where id = ?";
		return jdbcTemplate.update(sql, ltc.getTenLopTC(), ltc.getIdKhoa(), ltc.getIdKhoaHoc(), ltc.getIdMon(), ltc.getMaGV(), ltc.getStatus(), ltc.getCreated_by(), ltc.getId()) > 0;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public loptinchi getById(String id) {
		// TODO Auto-generated method stub
		String sql = "Select * from loptinchi where id = ?";
		return jdbcTemplate.query(sql, new ResultSetExtractor<loptinchi>() {
			@Override
			public loptinchi extractData(ResultSet rs) throws SQLException, DataAccessException {
				loptinchi ltc = new loptinchi();
				while (rs.next()) {
					ltc.setId(rs.getString("id"));
					ltc.setTenLopTC(rs.getString("TenLopTC"));
					ltc.setIdKhoa(rs.getString("idKhoa"));
					ltc.setIdKhoaHoc(rs.getString("idKhoaHoc"));
					ltc.setIdMon(rs.getString("idMon"));
					ltc.setMaGV(rs.getString("MaGV"));
					ltc.setStatus(rs.getInt("status"));
					ltc.setCreated_by(rs.getString("created_by"));
					ltc.setCreated_at(rs.getString("created_at"));
					ltc.setUpdated_at(rs.getString("updated_at"));
				}
			
				return ltc;
			}
		}, id);
	}

}
