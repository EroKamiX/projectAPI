package org.backend.DAO;

import java.util.List;

import org.backend.Entity.Mon;
import org.springframework.stereotype.Repository;

public interface monDAO {
	List<Mon> getAll();
	boolean insert(Mon mn);
	boolean update(Mon mn, String id);
	boolean delete(String id);
	Mon getById(String id);
}
