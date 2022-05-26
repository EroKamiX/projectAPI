package org.backend.DAO;

import java.util.List;

import org.backend.Entity.lopHoc;
import org.springframework.stereotype.Repository;

public interface lopHocDAO {
	List<lopHoc> getAll();
	boolean insert(lopHoc lh);
	boolean update(String id, lopHoc lh);
	boolean delete(String id);
	lopHoc getById(String id);
}
