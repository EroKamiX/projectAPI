package org.backend.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.lichHocDAO;
import org.backend.Entity.lichHoc;
import org.backend.Models.lichHocDTO;
import org.backend.Service.lichHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class lichHocServiceImpl implements lichHocService {

	@Autowired
	lichHocDAO lhd;
	
	@Override
	public List<lichHocDTO> getAll() {
		// TODO Auto-generated method stub
		List<lichHocDTO> ls = new ArrayList();
		for (lichHoc lh : lhd.getAll()) {
			lichHocDTO lhdt = new lichHocDTO();
			lhdt.setId(lh.getId());
			lhdt.setIdLopTc(lh.getIdLopTc());
			lhdt.setGioHoc(lh.getGioHoc());
			lhdt.setStatus(lh.getStatus());
			lhdt.setNgayBatDau(lh.getNgayBatDau());
			lhdt.setNgayKetThuc(lh.getNgayKetThuc());
			lhdt.setCreated_by(lh.getCreated_by());
			lhdt.setCreated_at(lh.getCreated_at());
			lhdt.setUpdated_at(lh.getUpdated_at());
			ls.add(lhdt);
		}
		return ls;
	}

	@Override
	public boolean insert(lichHocDTO lhdt) {
		// TODO Auto-generated method stub
		lichHoc lh = new lichHoc();
		lh.setId(lhdt.getId());
		lh.setIdLopTc(lhdt.getIdLopTc());
		lh.setGioHoc(lhdt.getGioHoc());
		lh.setStatus(lhdt.getStatus());
		lh.setNgayBatDau(lhdt.getNgayBatDau());
		lh.setNgayKetThuc(lhdt.getNgayKetThuc());
		lh.setCreated_by(lhdt.getCreated_by());
		lh.setCreated_at(lhdt.getCreated_at());
		lh.setUpdated_at(lhdt.getUpdated_at());
		return lhd.insert(lh);
	}

	@Override
	public boolean update(lichHocDTO lhdt, String id) {
		// TODO Auto-generated method stub
		lichHoc lh = new lichHoc();
		lh.setId(lhdt.getId());
		lh.setIdLopTc(lhdt.getIdLopTc());
		lh.setGioHoc(lhdt.getGioHoc());
		lh.setStatus(lhdt.getStatus());
		lh.setNgayBatDau(lhdt.getNgayBatDau());
		lh.setNgayKetThuc(lhdt.getNgayKetThuc());
		lh.setCreated_by(lhdt.getCreated_by());
		lh.setCreated_at(lhdt.getCreated_at());
		lh.setUpdated_at(lhdt.getUpdated_at());
		return lhd.update(id, lh);
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public lichHocDTO getById(String id) {
		// TODO Auto-generated method stub
		lichHoc lh = lhd.getById(id);
		lichHocDTO lhdt = new lichHocDTO();
		lhdt.setId(lh.getId());
		lhdt.setIdLopTc(lh.getIdLopTc());
		lhdt.setGioHoc(lh.getGioHoc());
		lhdt.setStatus(lh.getStatus());
		lhdt.setNgayBatDau(lh.getNgayBatDau());
		lhdt.setNgayKetThuc(lh.getNgayKetThuc());
		lhdt.setCreated_by(lh.getCreated_by());
		lhdt.setCreated_at(lh.getCreated_at());
		lhdt.setUpdated_at(lh.getUpdated_at());
		return lhdt;
	}

}
