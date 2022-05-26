package org.backend.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.dkTinChiDAO;
import org.backend.Entity.dkTinChi;
import org.backend.Models.dkTinChiDTO;
import org.backend.Service.dkTinChiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class dkTinChiServiceImpl implements dkTinChiService{

	@Autowired
	dkTinChiDAO dtcd;
	
	@Override
	public List<dkTinChiDTO> getAll() {
		// TODO Auto-generated method stub
		List<dkTinChiDTO> ls = new ArrayList();
		for (dkTinChi dtc : dtcd.getAll()) {
			dkTinChiDTO dtcdt = new dkTinChiDTO();
			dtcdt.setId(dtc.getId());
			dtcdt.setIdLopTC(dtc.getIdLopTC());
			dtcdt.setMaSV(dtc.getMaSV());
			dtcdt.setStatus(dtc.getStatus());
			dtcdt.setCreated_by(dtc.getCreated_by());
			dtcdt.setCreated_at(dtc.getCreated_at());
			dtcdt.setUpdated_at(dtc.getUpdated_at());
			ls.add(dtcdt);
		}
		return ls;
	}

	@Override
	public boolean insert(dkTinChiDTO dktd) {
		// TODO Auto-generated method stub
		dkTinChi dtc = new dkTinChi();
		dtc.setId(dktd.getId());
		dtc.setIdLopTC(dktd.getIdLopTC());
		dtc.setMaSV(dktd.getMaSV());
		dtc.setStatus(dktd.getStatus());
		dtc.setCreated_by(dktd.getCreated_by());
		dtc.setCreated_at(dktd.getCreated_at());
		dtc.setUpdated_at(dktd.getUpdated_at());
		return dtcd.insert(dtc);
	}

	@Override
	public boolean update(dkTinChiDTO dktd, String id) {
		// TODO Auto-generated method stub
		dkTinChi dtc = new dkTinChi();
		dtc.setId(dktd.getId());
		dtc.setIdLopTC(dktd.getIdLopTC());
		dtc.setMaSV(dktd.getMaSV());
		dtc.setStatus(dktd.getStatus());
		dtc.setCreated_by(dktd.getCreated_by());
		dtc.setCreated_at(dktd.getCreated_at());
		dtc.setUpdated_at(dktd.getUpdated_at());
		return dtcd.update(id, dtc);
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public dkTinChiDTO getById(String id) {
		// TODO Auto-generated method stub
		dkTinChi dtc = dtcd.getById(id);
		dkTinChiDTO dtcdt = new dkTinChiDTO();
		dtcdt.setId(dtc.getId());
		dtcdt.setIdLopTC(dtc.getIdLopTC());
		dtcdt.setMaSV(dtc.getMaSV());
		dtcdt.setStatus(dtc.getStatus());
		dtcdt.setCreated_by(dtc.getCreated_by());
		dtcdt.setCreated_at(dtc.getCreated_at());
		dtcdt.setUpdated_at(dtc.getUpdated_at());
		return dtcdt;
	}

}
