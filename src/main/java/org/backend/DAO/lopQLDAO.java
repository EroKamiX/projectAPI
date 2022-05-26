package org.backend.DAO;

import java.util.List;

import org.backend.Entity.lopQL;
import org.springframework.stereotype.Repository;

public interface lopQLDAO {
	List<lopQL> getAll();
	boolean insert(lopQL lql);
	boolean update(lopQL lql, String id);
	boolean delete(String id);
	lopQL getById(String id);
}
