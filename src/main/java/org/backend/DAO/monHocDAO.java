package org.backend.DAO;

import java.util.List;

import org.backend.Entity.monhoc;
import org.springframework.stereotype.Repository;

public interface monHocDAO {
	List<monhoc> getAll();
	boolean insert(monhoc mh);
	boolean update(monhoc mh, String id);
	boolean delete(String id);
	monhoc getById(String id);
}
