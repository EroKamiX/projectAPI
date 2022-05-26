package org.backend.Service;

import java.util.List;

import org.backend.Models.filesDTO;

public interface fileService {
	List<filesDTO> getAll();
	boolean insert(filesDTO ftd);
	boolean update(filesDTO ftd, String id);
	boolean delete(String id);
	filesDTO getById(String id);
}
