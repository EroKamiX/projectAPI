package org.backend.DAO;

import java.util.List;

import org.backend.Entity.baiTap;
import org.backend.Entity.studentBaiTap;
import org.springframework.stereotype.Repository;

public interface studentBaiTapDAO {
	List<studentBaiTap> getAll();
	List<studentBaiTap> getByUserName(String username);

	List<studentBaiTap> getByBaiTapId(int id);

	int getLastId();
	boolean insertWithFile(studentBaiTap sbt);

}
