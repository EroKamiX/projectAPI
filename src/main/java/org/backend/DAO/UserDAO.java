package org.backend.DAO;

import java.util.List;

import org.backend.Entity.User;

public interface UserDAO {
	List<User> getAll();
	boolean insert(User us);
	boolean update(String id, User us);
	boolean delete(String id);
	User getById(String id);
}
