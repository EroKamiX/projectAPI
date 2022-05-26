package org.backend.Service;

import java.util.List;

import org.backend.Models.monhocDTO;

public interface monHocService {
	List<monhocDTO> getAll();
	boolean insert(monhocDTO mhdto);
	boolean update(monhocDTO mhdto, String id);
	boolean delete(String id);
	monhocDTO getById(String id);
}
