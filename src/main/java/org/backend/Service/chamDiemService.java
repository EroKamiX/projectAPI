package org.backend.Service;

import java.util.List;

import org.backend.Entity.chamDiem;
import org.backend.Models.chamDiemDTO;

public interface chamDiemService {
	List<chamDiemDTO> getAll();
	boolean insert(chamDiemDTO cdt);
	boolean update(chamDiemDTO cdt, String id);
	boolean delete(String id);
	chamDiemDTO getById(int id);
}
