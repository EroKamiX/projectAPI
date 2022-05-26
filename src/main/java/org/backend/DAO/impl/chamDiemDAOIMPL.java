package org.backend.DAO.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.chamDiemDAO;
import org.backend.Entity.chamDiem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class chamDiemDAOIMPL implements chamDiemDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<chamDiem> getAll() {
		// TODO Auto-generated method stub
		String sql = "Select * from chamDiem";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<chamDiem>>() {
			@Override
			public List<chamDiem> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<chamDiem> ls = new ArrayList<chamDiem>();
				while (rs.next()) {
					chamDiem cd = new chamDiem();
					cd.setId(rs.getInt("id"));
					cd.setStudentId(rs.getString("studentId"));
					cd.setBaitapid(rs.getInt("baitapId"));
					cd.setDiem(rs.getInt("diem"));
					cd.setThangDiem(rs.getInt("thangDiem"));
					ls.add(cd);
				}
				return ls;
			}
		});
	}

	@Override
	public boolean insert(chamDiem cd) {
		// TODO Auto-generated method stub
		String sql = "Insert into chamDiem (`diem`, `thangDiem`, `baitapId`, `studentId`) values(?,?,?,?)";
		return jdbcTemplate.update(sql, cd.getDiem(), cd.getThangDiem(), cd.getBaitapid(), cd.getStudentId()) > 0;
	}

	@Override
	public boolean update(chamDiem cd, String id) {
		// TODO Auto-generated method stub
		String sql = "Update chamDiem set diem = ?, thangDiem = ?, baitapId = ?, studentId = ? where id = ?";
		return jdbcTemplate.update(sql, cd.getDiem(), cd.getThangDiem(), cd.getBaitapid(), cd.getStudentId()) > 0;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public chamDiem getById(int id) {
		// TODO Auto-generated method stub
		String sql = "Select * from chamDiem where id = ?";
		return jdbcTemplate.query(sql, new ResultSetExtractor<chamDiem>() {
			@Override
			public chamDiem extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				chamDiem cd = new chamDiem();
				while (rs.next()) {
					cd.setId(rs.getInt("id"));
					cd.setStudentId(rs.getString("studentId"));
					cd.setBaitapid(rs.getInt("baitapId"));
					cd.setDiem(rs.getInt("diem"));
					cd.setThangDiem(rs.getInt("thangDiem"));
				}
				return cd;
			}
		}, id);
	}

}
