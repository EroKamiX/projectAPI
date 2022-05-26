package org.backend.Service;

import java.util.List;

import org.backend.Models.loptinchiDTO;

public interface loptinchiService {
	List<loptinchiDTO> getAll();
	boolean insert(loptinchiDTO ltdt);
	boolean update(loptinchiDTO ltdt, String id);
	boolean delete(String id);
	loptinchiDTO getById(String id);
}
