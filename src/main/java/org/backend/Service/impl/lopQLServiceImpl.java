package org.backend.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.lopQLDAO;
import org.backend.Entity.lopQL;
import org.backend.Models.lopQLDTO;
import org.backend.Service.lopQLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class lopQLServiceImpl implements lopQLService{
	
	@Autowired
	lopQLDAO lqlDao;

	@Override
	public List<lopQLDTO> getAll() {
		// TODO Auto-generated method stub
		List<lopQLDTO> ls = new ArrayList<>();
		for (lopQL lql : lqlDao.getAll()) {
			lopQLDTO ltdc = new lopQLDTO();
			ltdc.setId(lql.getId());
			ltdc.setTenLop(lql.getTenLop());
			ltdc.setKhoa(lql.getKhoa());
			ltdc.setKhoaHoc(lql.getKhoaHoc());
			ltdc.setMGV(lql.getMGV());
			ltdc.setStatus(lql.getStatus());
			ltdc.setCreated_by(lql.getCreated_by());
			ltdc.setCreated_at(lql.getCreated_at());
			ltdc.setUpdated_at(lql.getUpdated_at());
			ls.add(ltdc);
		}
		return ls;
	}

	@Override
	public boolean insert(lopQLDTO lqdt) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(lopQLDTO lqdt) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public lopQLDTO getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
