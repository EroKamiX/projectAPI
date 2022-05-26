package org.backend.DAO;

import java.util.List;

import org.backend.Entity.dkTinChi;
import org.springframework.stereotype.Repository;

public interface dkTinChiDAO {
	List<dkTinChi> getAll();
	boolean insert(dkTinChi dktc);
	boolean update(String id, dkTinChi dktc);
	boolean delete(String id);
	dkTinChi getById(String id);
}
