package org.backend.DAO;

import java.util.List;

import org.backend.Entity.dangHoc;
import org.springframework.stereotype.Repository;

public interface dangHocDAO {
	List<dangHoc> getAll();
	boolean insert(dangHoc dh);
	boolean update(dangHoc dh, String id);
	boolean delete(String id);
	dangHoc getById(String id);
}
