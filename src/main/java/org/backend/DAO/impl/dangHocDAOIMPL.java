package org.backend.DAO.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.dangHocDAO;
import org.backend.Entity.dangHoc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class dangHocDAOIMPL implements dangHocDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<dangHoc> getAll() {
        String sql = "SELECT * FROM danghoc";
        return jdbcTemplate.query(sql, new ResultSetExtractor<List<dangHoc>>() {
			@Override
			public List<dangHoc> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<dangHoc> ls = new ArrayList<>();
                while (rs.next()) {
                    dangHoc st = new dangHoc();
                    st.setId(rs.getInt("id"));
                    st.setIdMon(rs.getString("idMon"));
                    st.setClassId(rs.getString("classid"));
                    st.setIdTeacher(rs.getString("idTeacher"));
                    ls.add(st);
                }
                return ls;
			}
        });
	}

	@Override
	public boolean insert(dangHoc dh) {
		String sql = "INSERT INTO danghoc(`classId`,`idMon`,`idTeacher`) Values (?,?,?)";
        return jdbcTemplate.update(sql, dh.getClassId(), dh.getIdMon(), dh.getIdTeacher()) > 0;
	}

	@Override
	public boolean update(dangHoc dh, String id) {
		// TODO Auto-generated method stub
		String sql = "UPDATE danghoc SET classId = ?, idMon = ?, idTeacher = ? where id = ?";
        return jdbcTemplate.update(sql, dh.getId(), dh.getIdMon(), dh.getClassId(), dh.getIdTeacher(), id) > 0;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public dangHoc getById(String id) {
		// TODO Auto-generated method stub
		String sql = "Select * from dangHoc where id = ?";
		return jdbcTemplate.query(sql, new ResultSetExtractor<dangHoc>() {
			@Override
			public dangHoc extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				dangHoc dh = new dangHoc();
                while (rs.next()) {
                    dh.setId(rs.getInt("id"));
                    dh.setIdMon(rs.getString("idMon"));
                    dh.setClassId(rs.getString("classid"));
                    dh.setIdTeacher(rs.getString("idTeacher"));
                }
                return dh;
			}
		}, id);
	}
 
}
