package org.backend.Service;

import java.util.List;

import org.backend.Entity.bangCap;
import org.backend.Models.bangCapDTO;

public interface bangCapSevice {
	List<bangCapDTO> getAll();
	boolean insert(bangCapDTO bcd);
	boolean update(bangCapDTO bcd, String id);
	boolean delete(String id);
	bangCapDTO getById(String id);
}
