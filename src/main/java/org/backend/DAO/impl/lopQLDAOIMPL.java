package org.backend.DAO.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.lopQLDAO;
import org.backend.Entity.lopQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class lopQLDAOIMPL implements lopQLDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<lopQL> getAll() {
		// TODO Auto-generated method stub
		String sql = "Select * from lopql";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<lopQL>>() {
			@Override
			public List<lopQL> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<lopQL> ls = new ArrayList<>();
				while (rs.next()) {
					lopQL lql = new lopQL();
					lql.setId(rs.getString("id"));
					lql.setTenLop(rs.getString("tenLop"));
					lql.setKhoa(rs.getString("khoa"));
					lql.setKhoaHoc(rs.getString("khoaHoc"));
					lql.setMGV(rs.getString("MGV"));
					lql.setStatus(rs.getInt("status"));
					lql.setCreated_by(rs.getString("created_by"));
					lql.setCreated_at(rs.getString("created_at"));
					lql.setUpdated_at(rs.getString("updated_at"));
					ls.add(lql);
				}
				return ls;
			}
		});
	}

	@Override
	public boolean insert(lopQL lql) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(lopQL lql, String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public lopQL getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
