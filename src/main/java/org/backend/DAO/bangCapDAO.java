package org.backend.DAO;

import java.util.List;

import org.backend.Entity.bangCap;
import org.springframework.stereotype.Repository;

public interface bangCapDAO {
	List<bangCap> getAll();
	boolean insert(bangCap bc);
	boolean update(bangCap bc, String id);
	boolean delete(String id);
	bangCap getById(String id);
}
