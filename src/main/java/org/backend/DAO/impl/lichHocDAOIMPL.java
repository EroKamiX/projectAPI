package org.backend.DAO.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.backend.DAO.lichHocDAO;
import org.backend.Entity.lichHoc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class lichHocDAOIMPL implements lichHocDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<lichHoc> getAll() {
		// TODO Auto-generated method stub
		String sql = "Select * from lichHoc";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<lichHoc>>(){
			@Override
			public List<lichHoc> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<lichHoc> ls = new ArrayList();
				while (rs.next()) {
					lichHoc lh = new lichHoc();
					lh.setId(rs.getInt("id"));
					lh.setIdLopTc(rs.getString("idLopTC"));
					lh.setNgayBatDau(rs.getString("NgayBatDau"));
					lh.setNgayKetThuc(rs.getString("NgayKetThuc"));
					lh.setGioHoc(rs.getString("GioHoc"));
					lh.setStatus(rs.getInt("status"));
					lh.setCreated_by(rs.getString("created_by"));
					lh.setCreated_at(rs.getString("created_at"));
					lh.setUpdated_at(rs.getString("updated_at"));
					ls.add(lh);
				}
				return ls;
			}
		});
	}

	@Override
	public boolean insert(lichHoc lh) {
		// TODO Auto-generated method stub
		String sql = "Insert into lichHoc (`idLopTC`,`NgayBatDau`,`NgayKetThuc`,`GioHoc`,`status`,`created_by`) values (?,?,?,?,?,?)";
		return jdbcTemplate.update(sql, lh.getIdLopTc(), lh.getNgayBatDau(), lh.getNgayKetThuc(), lh.getGioHoc(), lh.getStatus(), lh.getCreated_by()) > 0;
	}

	@Override
	public boolean update(String id, lichHoc lh) {
		// TODO Auto-generated method stub
		String sql = "Update lichHoc set idLopTC = ?, NgayBatDau = ?, NgayKetThuc = ?, GioHoc = ?, status = ?, created_by = ? where id = ?";
		return jdbcTemplate.update(sql, lh.getIdLopTc(), lh.getNgayBatDau(), lh.getNgayKetThuc(), lh.getGioHoc(), lh.getStatus(), lh.getCreated_by(), id) > 0;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public lichHoc getById(String id) {
		// TODO Auto-generated method stub
		String sql = "Select * from lichHoc where idLopTC = ?";
		return jdbcTemplate.query(sql, new ResultSetExtractor<lichHoc>() {
			@Override
			public lichHoc extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				lichHoc lh = new lichHoc();
				while (rs.next()) {
					lh.setId(rs.getInt("id"));
					lh.setIdLopTc(rs.getString("idLopTC"));
					lh.setNgayBatDau(rs.getString("NgayBatDau"));
					lh.setNgayKetThuc(rs.getString("NgayKetThuc"));
					lh.setGioHoc(rs.getString("GioHoc"));
					lh.setStatus(rs.getInt("status"));
					lh.setCreated_by(rs.getString("created_by"));
					lh.setCreated_at(rs.getString("created_at"));
					lh.setUpdated_at(rs.getString("updated_at"));
				}
				return lh;
			}
		}, id);
	}

}
