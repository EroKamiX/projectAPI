package org.backend.Service.impl;

import java.util.List;

import org.backend.Models.UserDTO;
import org.backend.Service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public List<UserDTO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(UserDTO udt) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(UserDTO udt, String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserDTO getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
