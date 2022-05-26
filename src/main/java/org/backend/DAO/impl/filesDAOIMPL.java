package org.backend.DAO.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.filesDAO;
import org.backend.Entity.files;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class filesDAOIMPL implements filesDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<files> getAll() {
		// TODO Auto-generated method stub
		String sql = "Select * from files";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<files>>() {
			@Override
			public List<files> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<files> ls = new ArrayList();
				while (rs.next()) {
					files f = new files();
					f.setId(rs.getInt("id"));
					f.setFilename(rs.getString("filename"));
					f.setBaiTapId(rs.getInt("baiTapId"));
					f.setNopBaiTapId(rs.getInt("nopBaiTapId"));
					ls.add(f);
				}
				return ls;
			}
		});
	}

	@Override
	public boolean insert(files f) {
		// TODO Auto-generated method stub
		String sql = "Insert into files(`filename`, `baiTapId`, `nopBaiTapId`) values (?,?,?)";
		return jdbcTemplate.update(sql, f.getFilename(), f.getBaiTapId(), f.getNopBaiTapId()) > 0;
	}

	@Override
	public boolean update(String id, files f) {
		// TODO Auto-generated method stub
		String sql = "Update files set filename = ?, baiTapId = ?, nopBaiTapId = ? where id = ?";
		return jdbcTemplate.update(sql, f.getFilename(), f.getBaiTapId(), f.getNopBaiTapId(), id) > 0;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public files getById(String id) {
		// TODO Auto-generated method stub
		String sql = "Select * from files where id = ?";
		return jdbcTemplate.query(sql, new ResultSetExtractor<files>() {
			@Override
			public files extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				files f = new files();
				while (rs.next()) {
					f.setId(rs.getInt("id"));
					f.setFilename(rs.getString("filename"));
					f.setBaiTapId(rs.getInt("baiTapId"));
					f.setNopBaiTapId(rs.getInt("nopBaiTapId"));
				}
				return f;
			}
		}, id);
	}

}
