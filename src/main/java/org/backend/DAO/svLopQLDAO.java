package org.backend.DAO;

import java.util.List;

import org.backend.Entity.svLopQL;
import org.springframework.stereotype.Repository;

public interface svLopQLDAO {
	List<svLopQL> getAll();
	boolean insert(svLopQL svql);
	boolean update(String id, svLopQL svql);
	boolean delete(String id);
	svLopQL getById(String id);
}
