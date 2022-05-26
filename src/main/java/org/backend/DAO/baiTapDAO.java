package org.backend.DAO;

import java.util.List;

import org.backend.Entity.baiTap;
import org.springframework.stereotype.Repository;

public interface baiTapDAO {
	List<baiTap> getAll(String id, String monhoc);
	List<baiTap> getAll();
	boolean insert(baiTap bt);
	boolean update(String id, baiTap bt);
	boolean delete(String id);
	int getLastId();
	baiTap getById(int id);
}
