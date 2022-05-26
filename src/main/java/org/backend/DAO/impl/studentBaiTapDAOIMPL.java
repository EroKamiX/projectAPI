package org.backend.DAO.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.studentBaiTapDAO;
import org.backend.Entity.baiTap;
import org.backend.Entity.studentBaiTap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class studentBaiTapDAOIMPL implements studentBaiTapDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<studentBaiTap> getAll() {
		return null;
	}

	@Override
	public List<studentBaiTap> getByUserName(String username) {
		String sql = "Select * from studentBaiTap where username = ?";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<studentBaiTap>>() {
			@Override
			public List<studentBaiTap> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
				List<studentBaiTap> ls = new ArrayList<>();
				while (resultSet.next()) {

				}
				return null;
			}
		});
	}

	@Override
	public List<studentBaiTap> getByBaiTapId(int id) {
		String sql = "SELECT * FROM studentBaiTap where baiTapid = ?";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<studentBaiTap>>() {
			@Override
			public List<studentBaiTap> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<studentBaiTap> ls = new ArrayList<>();
				while (rs.next()) {
					studentBaiTap stbt = new studentBaiTap();
					stbt.setId(rs.getInt("id"));
					stbt.setUsername(rs.getString("username"));
					stbt.setBaiTapId(rs.getInt("baiTapId"));
					stbt.setLienket(rs.getString("lienket"));
					ls.add(stbt);
				}
				return ls;
			}
		}, id);
	}


	@Override
	public int getLastId() {
		String sql = "SELECT max(id) as 'id' FROM studentBaiTap";
		return jdbcTemplate.query(sql, new ResultSetExtractor<Integer>() {
			@Override
			public Integer extractData(ResultSet resultSet) throws SQLException, DataAccessException {
				int id = 0;
				while (resultSet.next()) {
					id = resultSet.getInt("id");
				}
				return id;
			}
		});
	}

	@Override
	public boolean insertWithFile(studentBaiTap sbt) {
		String sql = "INSERT INTO studentBaiTap(`username`, `baiTapId`, `lienket`) VALUES (?,?,?)";
		return jdbcTemplate.update(sql, sbt.getUsername(), sbt.getBaiTapId(), sbt.getLienket()) > 0;
	}
}
