package org.backend.Service;

import java.util.List;

import org.backend.Models.lichHocDTO;

public interface lichHocService {
	List<lichHocDTO> getAll();
	boolean insert(lichHocDTO lhdt);
	boolean update(lichHocDTO lhdt, String id);
	boolean delete(String id);
	lichHocDTO getById(String id);
}
