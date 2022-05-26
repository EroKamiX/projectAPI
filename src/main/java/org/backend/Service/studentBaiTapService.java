package org.backend.Service;

import java.util.List;

import org.backend.Entity.studentBaiTap;
import org.backend.Models.studentBaiTapDTO;

public interface studentBaiTapService {
	List<studentBaiTapDTO> getAll();
	List<studentBaiTapDTO> getByUserName(String username);

	List<studentBaiTapDTO> getByBaiTapId(int id);

	int getLastId();
	boolean insertWithFile(studentBaiTapDTO sbt);
}
