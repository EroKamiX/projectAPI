package org.backend.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.khoaDAO;
import org.backend.Entity.khoa;
import org.backend.Models.khoaDTO;
import org.backend.Service.khoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class khoaServiceImpl implements khoaService{

	@Autowired
	khoaDAO kd;
	
	@Override
	public List<khoaDTO> getAll() {
		// TODO Auto-generated method stub
		List<khoaDTO> ls = new ArrayList();
		for (khoa kh : kd.getAll()) {
			khoaDTO kdt = new khoaDTO();
			kdt.setId(kh.getId());
			kdt.setTenKhoa(kh.getTenKhoa());
			kdt.setStatus(kh.getStatus());
			kdt.setCreated_by(kh.getCreated_by());
			kdt.setCreated_at(kh.getCreated_at());
			kdt.setUpdated_at(kh.getUpdated_at());
			ls.add(kdt);
		}
		return ls;
	}

	@Override
	public boolean insert(khoaDTO kdt) {
		// TODO Auto-generated method stub
		khoa kh = new khoa();
		kh.setId(kdt.getId());
		kh.setTenKhoa(kdt.getTenKhoa());
		kh.setStatus(kdt.getStatus());
		kh.setCreated_by(kdt.getCreated_by());
		kh.setCreated_at(kdt.getCreated_at());
		kh.setUpdated_at(kdt.getUpdated_at());
		return kd.insert(kh);
	}

	@Override
	public boolean update(khoaDTO kdt, String id) {
		// TODO Auto-generated method stub
		khoa kh = new khoa();
		kh.setId(kdt.getId());
		kh.setTenKhoa(kdt.getTenKhoa());
		kh.setStatus(kdt.getStatus());
		kh.setCreated_by(kdt.getCreated_by());
		kh.setCreated_at(kdt.getCreated_at());
		kh.setUpdated_at(kdt.getUpdated_at());
		return kd.update(kh, id);
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public khoaDTO getById(String id) {
		// TODO Auto-generated method stub
		khoa kh = kd.getById(id);
		khoaDTO kdt = new khoaDTO();
		kdt.setId(kh.getId());
		kdt.setTenKhoa(kh.getTenKhoa());
		kdt.setStatus(kh.getStatus());
		kdt.setCreated_by(kh.getCreated_by());
		kdt.setCreated_at(kh.getCreated_at());
		kdt.setUpdated_at(kh.getUpdated_at());
		return kdt;
	}

}
