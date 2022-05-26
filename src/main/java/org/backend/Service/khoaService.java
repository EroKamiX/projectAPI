package org.backend.Service;

import java.util.List;

import org.backend.Models.khoaDTO;

public interface khoaService {
	List<khoaDTO> getAll();
	boolean insert(khoaDTO kdt);
	boolean update(khoaDTO kdt, String id);
	boolean delete(String id);
	khoaDTO getById(String id);
}
