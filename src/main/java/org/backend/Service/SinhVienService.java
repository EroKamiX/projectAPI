package org.backend.Service;

import java.util.List;

import org.backend.Models.SinhVienDTO;

public interface SinhVienService {
	List<SinhVienDTO> getAll();
	boolean insert(SinhVienDTO svdt);
	boolean update(SinhVienDTO svdt, String id);
	boolean delete(String id);
	SinhVienDTO getById(String id);
}
