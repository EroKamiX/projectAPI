package org.backend.Service;

import java.util.List;

import org.backend.Models.svLopQLDTO;

public interface svLopQLService {
	List<svLopQLDTO> getAll();
	boolean insert(svLopQLDTO svlq);
	boolean update(svLopQLDTO svlq, String id);
	boolean delete(String id);
	svLopQLDTO getById(String id);
}
