package org.backend.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.loptinchiDAO;
import org.backend.Entity.loptinchi;
import org.backend.Models.loptinchiDTO;
import org.backend.Service.loptinchiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class lopTinChiServiceImpl implements loptinchiService{

	@Autowired
	loptinchiDAO ltcd;

	@Override
	public List<loptinchiDTO> getAll() {
		// TODO Auto-generated method stub
		List<loptinchiDTO> ls = new ArrayList<>();
		for (loptinchi ltc : ltcd.getAll()) {
			loptinchiDTO ltdc = new loptinchiDTO();
			ltdc.setId(ltc.getId());
			ltdc.setMaGV(ltc.getMaGV());
			ltdc.setTenLopTC(ltc.getTenLopTC());
			ltdc.setIdKhoa(ltc.getIdKhoa());
			ltdc.setIdKhoaHoc(ltc.getIdKhoaHoc());
			ltdc.setIdMon(ltc.getIdMon());
			ltdc.setStatus(ltc.getStatus());
			ltdc.setCreated_by(ltc.getCreated_by());
			ltdc.setCreated_at(ltc.getCreated_at());
			ltdc.setUpdated_at(ltc.getUpdated_at());
			ls.add(ltdc);
		}
		return ls;
	}

	@Override
	public boolean insert(loptinchiDTO ltdt) {
		// TODO Auto-generated method stub
		loptinchi ltc = new loptinchi();
		ltc.setId(ltdt.getId());
		ltc.setMaGV(ltdt.getMaGV());
		ltc.setTenLopTC(ltdt.getTenLopTC());
		ltc.setIdKhoa(ltdt.getIdKhoa());
		ltc.setIdKhoaHoc(ltdt.getIdKhoaHoc());
		ltc.setIdMon(ltdt.getIdMon());
		ltc.setStatus(ltdt.getStatus());
		ltc.setCreated_by(ltdt.getCreated_by());
		ltc.setCreated_at(ltdt.getCreated_at());
		ltc.setUpdated_at(ltdt.getUpdated_at());
		return ltcd.insert(ltc);
	}

	@Override
	public boolean update(loptinchiDTO ltdt, String id) {
		// TODO Auto-generated method stub
		loptinchi ltc = new loptinchi();
		ltc.setId(ltdt.getId());
		ltc.setMaGV(ltdt.getMaGV());
		ltc.setTenLopTC(ltdt.getTenLopTC());
		ltc.setIdKhoa(ltdt.getIdKhoa());
		ltc.setIdKhoaHoc(ltdt.getIdKhoaHoc());
		ltc.setIdMon(ltdt.getIdMon());
		ltc.setStatus(ltdt.getStatus());
		ltc.setCreated_by(ltdt.getCreated_by());
		ltc.setCreated_at(ltdt.getCreated_at());
		ltc.setUpdated_at(ltdt.getUpdated_at());
		return ltcd.update(id, ltc);
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public loptinchiDTO getById(String id) {
		// TODO Auto-generated method stub
		loptinchiDTO ltdc = new loptinchiDTO();
		loptinchi ltc = ltcd.getById(id);
		ltdc.setId(ltc.getId());
		ltdc.setMaGV(ltc.getMaGV());
		ltdc.setTenLopTC(ltc.getTenLopTC());
		ltdc.setIdKhoa(ltc.getIdKhoa());
		ltdc.setIdKhoaHoc(ltc.getIdKhoaHoc());
		ltdc.setIdMon(ltc.getIdMon());
		ltdc.setStatus(ltc.getStatus());
		ltdc.setCreated_by(ltc.getCreated_by());
		ltdc.setCreated_at(ltc.getCreated_at());
		ltdc.setUpdated_at(ltc.getUpdated_at());
		return ltdc;
	}

}
