package org.backend.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.monDAO;
import org.backend.Entity.Mon;
import org.backend.Models.MonDTO;
import org.backend.Service.monService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class monServiceImpl implements monService{

	@Autowired
	monDAO md;

	@Override
	public List<MonDTO> getAll() {
		// TODO Auto-generated method stub
		List<MonDTO> ls = new ArrayList<>();
		for (Mon mn : md.getAll()) {
			MonDTO mdt = new MonDTO();
			mdt.setId(mn.getId());
			mdt.setTenMon(mn.getTenMon());
			mdt.setKhoa(mn.getKhoa());
			mdt.setSoTietHoc(mn.getSoTietHoc());
			mdt.setSoTinChi(mn.getSoTinChi());
			mdt.setStatus(mn.getStatus());
			mdt.setCreated_by(mn.getCreated_by());
			mdt.setCreated_at(mn.getCreated_at());
			mdt.setUpdated_at(mn.getUpdated_at());
			ls.add(mdt);
		}
		return ls;
	}

	@Override
	public boolean insert(MonDTO mdt) {
		// TODO Auto-generated method stub
		Mon mn = new Mon();
		mn.setId(mdt.getId());
		mn.setTenMon(mdt.getTenMon());
		mn.setKhoa(mdt.getKhoa());
		mn.setSoTietHoc(mdt.getSoTietHoc());
		mn.setSoTinChi(mdt.getSoTinChi());
		mn.setStatus(mdt.getStatus());
		mn.setCreated_by(mdt.getCreated_by());
		mn.setCreated_at(mdt.getCreated_at());
		mn.setUpdated_at(mdt.getUpdated_at());
		return md.insert(mn);
	}

	@Override
	public boolean update(MonDTO mdt, String id) {
		// TODO Auto-generated method stub
		Mon mn = new Mon();
		mn.setId(mdt.getId());
		mn.setTenMon(mdt.getTenMon());
		mn.setKhoa(mdt.getKhoa());
		mn.setSoTietHoc(mdt.getSoTietHoc());
		mn.setSoTinChi(mdt.getSoTinChi());
		mn.setStatus(mdt.getStatus());
		mn.setCreated_by(mdt.getCreated_by());
		mn.setCreated_at(mdt.getCreated_at());
		mn.setUpdated_at(mdt.getUpdated_at());
		return md.update(mn, id);
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MonDTO getById(String id) {
		// TODO Auto-generated method stub
		MonDTO mdt = new MonDTO();
		Mon mn = md.getById(id);
		mdt.setId(mn.getId());
		mdt.setTenMon(mn.getTenMon());
		mdt.setKhoa(mn.getKhoa());
		mdt.setSoTietHoc(mn.getSoTietHoc());
		mdt.setSoTinChi(mn.getSoTinChi());
		mdt.setStatus(mn.getStatus());
		mdt.setCreated_by(mn.getCreated_by());
		mdt.setCreated_at(mn.getCreated_at());
		mdt.setUpdated_at(mn.getUpdated_at());
		return mdt;
	}

}
