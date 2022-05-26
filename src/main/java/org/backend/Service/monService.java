package org.backend.Service;

import java.util.List;

import org.backend.Models.MonDTO;

public interface monService {
	List<MonDTO> getAll();
	boolean insert(MonDTO mdt);
	boolean update(MonDTO mdt, String id);
	boolean delete(String id);
	MonDTO getById(String id);
}
