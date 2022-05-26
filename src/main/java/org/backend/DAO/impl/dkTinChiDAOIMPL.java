package org.backend.DAO.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.dkTinChiDAO;
import org.backend.Entity.dkTinChi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class dkTinChiDAOIMPL implements dkTinChiDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<dkTinChi> getAll() {
		// TODO Auto-generated method stub
		String sql = "Select * from dkTinChi";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<dkTinChi>>() {
			@Override
			public List<dkTinChi> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<dkTinChi> ls = new ArrayList();
				while (rs.next()) {
					dkTinChi dtc = new dkTinChi();
					dtc.setId(rs.getInt("id"));
					dtc.setMaSV(rs.getString("maSV"));
					dtc.setIdLopTC(rs.getString("idLopTC"));
					dtc.setStatus(rs.getInt("status"));
					dtc.setCreated_by(rs.getString("created_by"));
					dtc.setCreated_at(rs.getString("created_at"));
					dtc.setUpdated_at(rs.getString("updated_at"));
					ls.add(dtc);
				}
				return ls;
			}
		});
	}

	@Override
	public boolean insert(dkTinChi dktc) {
		// TODO Auto-generated method stub
		String sql = "Insert into dkTinChi (`maSV`,`idLopTC`,`status`,`created_by`) values (?,?,?,?)";
		return jdbcTemplate.update(sql, dktc.getMaSV(), dktc.getIdLopTC(), dktc.getStatus(), dktc.getCreated_by()) > 0;
	}

	@Override
	public boolean update(String id, dkTinChi dktc) {
		// TODO Auto-generated method stub
		String sql = "Update dkTinChi set maSV = ?, idLopTC = ?, status = ?, created_by = ? where id = ?";
		return jdbcTemplate.update(sql, dktc.getMaSV(), dktc.getIdLopTC(), dktc.getStatus(), dktc.getCreated_by(), id) > 0;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public dkTinChi getById(String id) {
		// TODO Auto-generated method stub
		String sql = "Select * from dkTinChi where id = ?";
		return jdbcTemplate.query(sql, new ResultSetExtractor<dkTinChi>() {
			@Override
			public dkTinChi extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				dkTinChi dtc = new dkTinChi();
				while (rs.next()) {
					dtc.setId(rs.getInt("id"));
					dtc.setMaSV(rs.getString("maSV"));
					dtc.setIdLopTC(rs.getString("idLopTC"));
					dtc.setStatus(rs.getInt("status"));
					dtc.setCreated_by(rs.getString("created_by"));
					dtc.setCreated_at(rs.getString("created_at"));
					dtc.setUpdated_at(rs.getString("updated_at"));
				}
				return dtc;
			}
		}, id);
	}
}
