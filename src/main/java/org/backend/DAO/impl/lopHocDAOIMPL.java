package org.backend.DAO.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.lopHocDAO;
import org.backend.Entity.lopHoc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class lopHocDAOIMPL implements lopHocDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<lopHoc> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(lopHoc lh) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(String id, lopHoc lh) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public lopHoc getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
