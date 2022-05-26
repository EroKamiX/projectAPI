package org.backend.Service;

import java.util.List;

import org.backend.Models.lopQLDTO;

public interface lopQLService {
	List<lopQLDTO> getAll();
	boolean insert(lopQLDTO lqdt);
	boolean update(lopQLDTO lqdt);
	boolean delete(String id);
	lopQLDTO getById(String id);
}
