package org.backend.DAO;

import java.util.List;

import org.backend.Entity.lichHoc;
import org.springframework.stereotype.Repository;

public interface lichHocDAO {
	List<lichHoc> getAll();
	boolean insert(lichHoc lh);
	boolean update(String id, lichHoc lh);
	boolean delete(String id);
	lichHoc getById(String id);
}
