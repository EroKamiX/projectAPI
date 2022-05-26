package org.backend.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.giangVienDAO;
import org.backend.Entity.giangVien;
import org.backend.Models.giangVienDTO;
import org.backend.Service.giangVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class giangVienServiceImpl implements giangVienService{

	@Autowired
	giangVienDAO gvd;
	
	@Override
	public List<giangVienDTO> getAll() {
		// TODO Auto-generated method stub
		List<giangVienDTO> ls = new ArrayList();
		for (giangVien gv : gvd.getAll()) {
			giangVienDTO gvdt = new giangVienDTO();
			gvdt.setId(gv.getId());
			gvdt.setIdBangCap(gv.getIdBangCap());
			gvdt.setAvatar(gv.getAvatar());
			gvdt.setKhoa(gv.getKhoa());
			gvdt.setMagv(gv.getMagv());
			gvdt.setQuequan(gv.getQuequan());
			gvdt.setStatus(gv.getStatus());
			gvdt.setTenGV(gv.getTenGV());
			gvdt.setCreated_by(gv.getCreated_by());
			gvdt.setCreated_at(gv.getCreated_at());
			gvdt.setUpdated_at(gv.getUpdated_at());
			ls.add(gvdt);
		}
		return ls;
	}

	@Override
	public boolean insert(giangVienDTO gvdt) {
		// TODO Auto-generated method stub
		giangVien gv = new giangVien();
		gv.setId(gvdt.getId());
		gv.setIdBangCap(gvdt.getIdBangCap());
		gv.setAvatar(gvdt.getAvatar());
		gv.setKhoa(gvdt.getKhoa());
		gv.setMagv(gvdt.getMagv());
		gv.setQuequan(gvdt.getQuequan());
		gv.setStatus(gvdt.getStatus());
		gv.setTenGV(gvdt.getTenGV());
		gv.setCreated_at(gvdt.getCreated_at());
		gv.setCreated_by(gvdt.getCreated_by());
		gv.setUpdated_at(gvdt.getUpdated_at());
		return gvd.insert(gv);
	}

	@Override
	public boolean update(giangVienDTO gvdt, String id) {
		// TODO Auto-generated method stub
		giangVien gv = new giangVien();
		gv.setId(gvdt.getId());
		gv.setIdBangCap(gvdt.getIdBangCap());
		gv.setAvatar(gvdt.getAvatar());
		gv.setKhoa(gvdt.getKhoa());
		gv.setMagv(gvdt.getMagv());
		gv.setQuequan(gvdt.getQuequan());
		gv.setStatus(gvdt.getStatus());
		gv.setTenGV(gvdt.getTenGV());
		gv.setCreated_at(gvdt.getCreated_at());
		gv.setCreated_by(gvdt.getCreated_by());
		gv.setUpdated_at(gvdt.getUpdated_at());
		return gvd.update(id, gv);
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public giangVienDTO getById(String id) {
		// TODO Auto-generated method stub
		giangVien gv = gvd.getById(id);
		giangVienDTO gvdt = new giangVienDTO();
		gvdt.setId(gv.getId());
		gvdt.setIdBangCap(gv.getIdBangCap());
		gvdt.setAvatar(gv.getAvatar());
		gvdt.setKhoa(gv.getKhoa());
		gvdt.setMagv(gv.getMagv());
		gvdt.setQuequan(gv.getQuequan());
		gvdt.setStatus(gv.getStatus());
		gvdt.setTenGV(gv.getTenGV());
		gvdt.setCreated_by(gv.getCreated_by());
		gvdt.setCreated_at(gv.getCreated_at());
		gvdt.setUpdated_at(gv.getUpdated_at());
		return gvdt;
	}

}
