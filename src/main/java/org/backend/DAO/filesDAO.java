package org.backend.DAO;

import java.util.List;

import org.backend.Entity.files;
import org.springframework.stereotype.Repository;

public interface filesDAO {
	List<files> getAll();
	boolean insert(files f);
	boolean update(String id, files f);
	boolean delete(String id);
	files getById(String id);
}
