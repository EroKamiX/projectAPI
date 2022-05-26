package org.backend.Service;

import java.util.List;

import org.backend.Models.dkTinChiDTO;

public interface dkTinChiService {
	List<dkTinChiDTO> getAll();
	boolean insert(dkTinChiDTO dktd);
	boolean update(dkTinChiDTO dktd, String id);
	boolean delete(String id);
	dkTinChiDTO getById(String id);
}
