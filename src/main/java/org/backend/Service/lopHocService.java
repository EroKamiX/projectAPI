package org.backend.Service;

import java.util.List;

import org.backend.Models.lopHocDTO;

public interface lopHocService {
	List<lopHocDTO> getAll();
	boolean insert(lopHocDTO lhdt);
	boolean update(lopHocDTO lhdt, String id);
	boolean delete(String id);
	lopHocDTO getById(String id);
}
