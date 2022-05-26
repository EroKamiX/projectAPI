package org.backend.Service;

import java.util.List;

import org.backend.Models.UserDTO;

public interface UserService {
	List<UserDTO> getAll();
	boolean insert(UserDTO udt);
	boolean update(UserDTO udt, String id);
	boolean delete(String id);
	UserDTO getById(String id);
}
