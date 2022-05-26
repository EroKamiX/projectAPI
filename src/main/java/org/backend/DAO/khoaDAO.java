package org.backend.DAO;

import java.util.List;

import org.backend.Entity.khoa;
import org.springframework.stereotype.Repository;

public interface khoaDAO {
	List<khoa> getAll();
	boolean insert(khoa kh);
	boolean update(khoa kh, String mkh);
	boolean delete(String mkh);
	khoa getById(String mkh);
}
