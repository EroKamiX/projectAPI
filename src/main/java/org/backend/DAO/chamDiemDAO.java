package org.backend.DAO;

import java.util.List;

import org.backend.Entity.chamDiem;
import org.springframework.stereotype.Repository;

public interface chamDiemDAO {
	List<chamDiem> getAll();
	boolean insert(chamDiem cd);
	boolean update(chamDiem cd, String id);
	boolean delete(String id);
	chamDiem getById(int id);
}
