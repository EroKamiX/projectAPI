package org.backend.Service;

import java.util.List;

import org.backend.Models.dangHocDTO;

public interface dangHocService {
	List<dangHocDTO> getAll();
	boolean insert(dangHocDTO dhtd);
	boolean update(dangHocDTO dhtd, String id);
	boolean delete(String id);
	dangHocDTO getById(String id);
}
