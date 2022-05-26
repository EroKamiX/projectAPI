package org.backend.DAO;

import java.util.List;

import org.backend.Entity.loptinchi;
import org.springframework.stereotype.Repository;

public interface loptinchiDAO {
	List<loptinchi> getAll();
	boolean insert(loptinchi ltc);
	boolean update(String id, loptinchi ltc);
	boolean delete(String id);
	loptinchi getById(String id);
}
