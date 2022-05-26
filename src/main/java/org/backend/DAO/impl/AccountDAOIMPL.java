package org.backend.DAO.impl;

import org.backend.DAO.AccountDAO;
import org.backend.Entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountDAOIMPL implements AccountDAO {

	 @Autowired
	    JdbcTemplate jdbcTemplate;

	    @Override
	    public List<Account> getAll() {
	        String sql = "SELECT account.username, password, teacherId, studentId, enabled, authority FROM account inner join authorities on authorities.username = account.username";
	        return jdbcTemplate.query(sql, new ResultSetExtractor<List<Account>>() {
	            @Override
	            public List<Account> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
	                List<Account> ls = new ArrayList<>();
	                while (resultSet.next()) {
	                    Account ac = new Account();
	                    ac.setPassword(resultSet.getString("password"));
	                    ac.setUsername(resultSet.getString("userName"));
	                    ac.setStudentId(resultSet.getString("studentId"));
	                    ac.setTeacherId(resultSet.getString("teacherId"));
	                    ac.setAuthority(resultSet.getString("authority"));
	                    ac.setEnabled(resultSet.getBoolean("enabled"));
	                    ls.add(ac);
	                }
	                return ls;
	            }
	        });
	    }

	    @Override
	    public boolean insert(Account account) {
	        String sql = "INSERT INTO account VALUES (?,?,?,?,?)";
	        return jdbcTemplate.update(sql, account.getUsername(), account.getPassword(), account.getTeacherId(), account.getStudentId(), account.isEnabled()) > 0;
	    }

	    @Override
	    public boolean insertAuthorities(String username, String authorities) {
	        String sql = "INSERT INTO authorities VALUES (?,?)";
	        return jdbcTemplate.update(sql, username, authorities) > 0;
	    }

	    @Override
	    public boolean update(String id, Account account) {
	        String sql = "UPDATE account SET username = ?, password = ?, teacherId = ?, studentId = ?, authority = ?, enabled = true WHERE id = ?";
	        return jdbcTemplate.update(sql, account.getUsername(), account.getPassword(), account.getTeacherId(), account.getStudentId(), account.getAuthority(), id) > 0;
	    }

	    @Override
	    public boolean delete(String id) {
	        String sql = "DELETE FROM account WHERE id = ?";
	        return jdbcTemplate.update(sql, id) > 0;
	    }

	    @Override
	    public Account getByUserName(String userName) {
	        String sql = "SELECT * FROM account where username = ?";
	        return jdbcTemplate.query(sql, new ResultSetExtractor<Account>() {
	            @Override
	            public Account extractData(ResultSet resultSet) throws SQLException, DataAccessException {
	                Account ac = new Account();
	                while (resultSet.next()) {
	                    ac.setPassword(resultSet.getString("password"));
	                    ac.setUsername(resultSet.getString("userName"));
	                    ac.setStudentId(resultSet.getString("studentId"));
	                    ac.setTeacherId(resultSet.getString("teacherId"));
	                }
	                return ac;
	            }
	        }, userName);
	    }

	    @Override
	    public List<String> getUserRoles(String username) {
	        String sql = "SELECT authority FROM authorities WHERE username = ?";
	        return jdbcTemplate.query(sql, new ResultSetExtractor<List<String>>() {
	            @Override
	            public List<String> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
	                List<String> roles = new ArrayList<>();
	                while (resultSet.next()) {
	                    roles.add(resultSet.getString("authority"));
	                }
	                return roles;
	            }
	        }, username);
	    }

	    @Override
	    public Account getSignIn(String username, String password) {
	        String sql = "SELECT account.username, password, teacherId, studentId, enabled, authority FROM account inner join authorities on authorities.username = account.username WHERE account.username = ? AND password = ?";
	        return jdbcTemplate.query(sql, new ResultSetExtractor<Account>() {
	            @Override
	            public Account extractData(ResultSet resultSet) throws SQLException, DataAccessException {
	                Account ac = new Account();
	                while (resultSet.next()) {
	                    ac.setUsername(resultSet.getString("username"));
	                    ac.setPassword(resultSet.getString("password"));
	                }
	                return ac;
	            }
	        });
	    }
}
