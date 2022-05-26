package org.backend.Service;

import java.util.List;

import org.backend.Models.baiTapDTO;

public interface baiTapService {
	List<baiTapDTO> getAll(String id, String monhoc);
	List<baiTapDTO> getAll();
	boolean insert(baiTapDTO btd);
	boolean update(String id, baiTapDTO btd);
	boolean delete(String id);
	int getLastId();
	baiTapDTO getById(int id);
}
