package org.backend.DAO.impl;

import java.util.List;

import org.backend.DAO.monHocDAO;
import org.backend.Entity.monhoc;
import org.springframework.stereotype.Repository;

@Repository
public class monHocDAOIMPL implements monHocDAO{

	@Override
	public List<monhoc> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(monhoc mh) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(monhoc mh, String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public monhoc getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
