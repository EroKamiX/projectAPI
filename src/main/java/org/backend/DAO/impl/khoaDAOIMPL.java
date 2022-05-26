package org.backend.DAO.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.khoaDAO;
import org.backend.Entity.khoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class khoaDAOIMPL implements khoaDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<khoa> getAll() {
		// TODO Auto-generated method stub
		String sql = "Select * from khoa";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<khoa>>() {
			@Override
			public List<khoa> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<khoa> ls = new ArrayList();
				while (rs.next()) {
					khoa kh = new khoa();
					kh.setId(rs.getString("id"));
					kh.setTenKhoa(rs.getString("tenKhoa"));
					kh.setStatus(rs.getInt("STATUS"));
					kh.setCreated_by(rs.getString("created_by"));
					kh.setCreated_at(rs.getString("created_at"));
					kh.setUpdated_at(rs.getString("updated_at"));
					ls.add(kh);
				}
				return ls;
			}
		});
	}

	@Override
	public boolean insert(khoa kh) {
		// TODO Auto-generated method stub
		String sql = "Insert into khoa (`tenKhoa`,`STATUS`,`created_by`) values (?,?,?)";
		return jdbcTemplate.update(sql, kh.getTenKhoa(), kh.getStatus(), kh.getCreated_by()) > 0;
	}

	@Override
	public boolean update(khoa kh, String mkh) {
		// TODO Auto-generated method stub
		String sql = "Update khoa set tenKhoa = ?, STATUS = ?, created_by = ? where id = ?";
		return jdbcTemplate.update(sql, kh.getTenKhoa(), kh.getStatus(), kh.getCreated_by(), mkh) > 0;
	}

	@Override
	public boolean delete(String mkh) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public khoa getById(String mkh) {
		// TODO Auto-generated method stub
		String sql = "Select * from khoa where id = ?";
		return jdbcTemplate.query(sql, new ResultSetExtractor<khoa>() {
			@Override
			public khoa extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				khoa kh = new khoa();
				while (rs.next()) {
				kh.setId(rs.getString("id"));
				kh.setTenKhoa(rs.getString("tenKhoa"));
				kh.setStatus(rs.getInt("STATUS"));
				kh.setCreated_by(rs.getString("created_by"));
				kh.setCreated_at(rs.getString("created_at"));
				kh.setUpdated_at(rs.getString("updated_at"));
				}
				return kh;
			}
		}, mkh);
	}

}
