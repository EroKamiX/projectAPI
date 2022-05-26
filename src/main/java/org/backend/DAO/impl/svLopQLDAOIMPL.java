package org.backend.DAO.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.svLopQLDAO;
import org.backend.Entity.svLopQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class svLopQLDAOIMPL implements svLopQLDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<svLopQL> getAll() {
		// TODO Auto-generated method stub
		final String sql = "Select * from svlopql";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<svLopQL>>() {
			@Override
			public List<svLopQL> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<svLopQL> ls = new ArrayList<>();
				while (rs.next()) {
					svLopQL slq = new svLopQL();
					slq.setId(rs.getInt("id"));
					slq.setMasv(rs.getString("MASV"));
					slq.setMaLopQL(rs.getString("maLopQL"));
					slq.setStatus(rs.getInt("STATUS"));
					slq.setCreated_by(rs.getString("created_by"));
					slq.setCreated_at(rs.getString("created_at"));
					slq.setUpdated_at(rs.getString("updated_at"));
					ls.add(slq);
				}
				return ls;
			}
		});
	}

	@Override
	public boolean insert(svLopQL svql) {
		// TODO Auto-generated method stub
		String sql = "Insert into svLopQL (`id`,`MASV`,`maLopQL`,`STATUS`,`created_by`) values (?,?,?,?,?)";
		return jdbcTemplate.update(sql, svql.getId(), svql.getMasv(), svql.getMaLopQL(), svql.getStatus(), svql.getCreated_by()) > 0;
	}

	@Override
	public boolean update(String id, svLopQL svql) {
		// TODO Auto-generated method stub
		String sql = "Update svLopQL set MASV = ?, maLopQL = ?, STATUS = ?, created_by = ? where id = ?";
		return jdbcTemplate.update(sql, svql.getMasv(), svql.getMaLopQL(), svql.getStatus(), svql.getCreated_by(), id) > 0;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public svLopQL getById(String id) {
		// TODO Auto-generated method stub
		String masv = id;
		String malopql = id;
		String sql = "Select * from svlopql where masv = ? or malopql = ?";
		return jdbcTemplate.query(sql, new ResultSetExtractor<svLopQL>() {
			@Override
			public svLopQL extractData(ResultSet rs) throws SQLException, DataAccessException {
				svLopQL slq = new svLopQL();
				while(rs.next()) {
					
					slq.setId(rs.getInt("id"));
					slq.setMasv(rs.getString("MASV"));
					slq.setMaLopQL(rs.getString("maLopQL"));
					slq.setStatus(rs.getInt("STATUS"));
					slq.setCreated_by(rs.getString("created_by"));
					slq.setCreated_at(rs.getString("created_at"));
					slq.setUpdated_at(rs.getString("updated_at"));
				}
				return slq;
			}
		}, masv,malopql);
	}

}
