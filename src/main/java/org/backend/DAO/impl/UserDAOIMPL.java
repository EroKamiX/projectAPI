package org.backend.DAO.impl;

import java.util.List;

import org.backend.DAO.UserDAO;
import org.backend.Entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOIMPL implements UserDAO{

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(User us) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(String id, User us) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
