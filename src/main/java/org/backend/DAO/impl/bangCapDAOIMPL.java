package org.backend.DAO.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.bangCapDAO;
import org.backend.Entity.bangCap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class bangCapDAOIMPL implements bangCapDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<bangCap> getAll() {
		// TODO Auto-generated method stub
		String sql = "Select * from bangCap";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<bangCap>>() {
			@Override
			public List<bangCap> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<bangCap> ls = new ArrayList();
				while (rs.next()) {
					bangCap bc = new bangCap();
					bc.setId(rs.getInt("id"));
					bc.setTenBangCap(rs.getString("Tenbangcap"));
					bc.setCreated_at(rs.getString("created_at"));
					bc.setCreated_by(rs.getString("created_by"));
					bc.setUpdated_at(rs.getString("updated_at"));
					ls.add(bc);
				}
				return ls;
			}
		});
	}

	@Override
	public boolean insert(bangCap bc) {
		// TODO Auto-generated method stub
		String sql = "Insert into bangCap (`TenBangCap` , `created_by`) values (?,?,?,?)";
		return jdbcTemplate.update(sql, bc.getTenBangCap(), bc.getCreated_by()) > 0;
	}

	@Override
	public boolean update(bangCap bc, String id) {
		// TODO Auto-generated method stub
		String sql = "Update bangCap set TenBangCap = ?, created_by = ? where id = ?";
		return jdbcTemplate.update(sql, bc.getTenBangCap(), bc.getCreated_by(), id) > 0;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public bangCap getById(String id) {
		// TODO Auto-generated method stub
		String sql = "Select * from bangCap where id = ?";
		return jdbcTemplate.query(sql, new ResultSetExtractor<bangCap>() {
			@Override
			public bangCap extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				bangCap bc = new bangCap();
				while (rs.next()) {
					bc.setId(rs.getInt("id"));
					bc.setTenBangCap(rs.getString("Tenbangcap"));
					bc.setCreated_at(rs.getString("created_at"));
					bc.setCreated_by(rs.getString("created_by"));
					bc.setUpdated_at(rs.getString("updated_at"));
				}
				return bc;
			}
		}, id);
	}

}
