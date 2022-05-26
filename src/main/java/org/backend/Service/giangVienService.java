package org.backend.Service;

import java.util.List;

import org.backend.Models.giangVienDTO;

public interface giangVienService {
	List<giangVienDTO> getAll();
	boolean insert(giangVienDTO gvd);
	boolean update(giangVienDTO gvd, String id);
	boolean delete(String id);
	giangVienDTO getById(String id);
}
