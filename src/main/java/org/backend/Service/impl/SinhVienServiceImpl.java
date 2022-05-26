package org.backend.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.SinhVienDAO;
import org.backend.Entity.SinhVien;
import org.backend.Models.SinhVienDTO;
import org.backend.Service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SinhVienServiceImpl implements SinhVienService{

	@Autowired
	SinhVienDAO svd;

	@Override
	public List<SinhVienDTO> getAll() {
		// TODO Auto-generated method stub
		List<SinhVienDTO> ls = new ArrayList<>();
		for (SinhVien sv : svd.getAll()) {
			SinhVienDTO svdt = new SinhVienDTO();
			svdt.setId(sv.getId());
			svdt.setTenSV(sv.getTenSV());
			svdt.setMasv(sv.getMasv());
			svdt.setKhoa(sv.getKhoa());
			svdt.setKhoaHoc(sv.getKhoaHoc());
			svdt.setQuequan(sv.getQuequan());
			svdt.setAvatar(sv.getAvatar());
			svdt.setStatus(sv.getStatus());
			svdt.setBirthday(sv.getBirthday());
			svdt.setCreated_by(sv.getCreated_by());
			svdt.setCreated_at(sv.getCreated_at());
			svdt.setUpdated_at(sv.getUpdated_at());
			ls.add(svdt);
		}
		return ls;
	}

	@Override
	public boolean insert(SinhVienDTO svdt) {
		// TODO Auto-generated method stub
		SinhVien sv = new SinhVien();
		sv.setId(svdt.getId());
		sv.setTenSV(svdt.getTenSV());
		sv.setMasv(svdt.getMasv());
		sv.setKhoa(svdt.getKhoa());
		sv.setKhoaHoc(svdt.getKhoaHoc());
		sv.setQuequan(svdt.getQuequan());
		sv.setAvatar(svdt.getAvatar());
		sv.setStatus(svdt.getStatus());
		sv.setBirthday(svdt.getBirthday());
		sv.setCreated_by(svdt.getCreated_by());
		sv.setCreated_at(svdt.getCreated_at());
		sv.setUpdated_at(svdt.getUpdated_at());
		return svd.insert(sv);
	}

	@Override
	public boolean update(SinhVienDTO svdt, String id) {
		// TODO Auto-generated method stub
		SinhVien sv = new SinhVien();
		sv.setId(svdt.getId());
		sv.setMasv(svdt.getMasv());
		sv.setTenSV(svdt.getTenSV());
		sv.setKhoa(svdt.getKhoa());
		sv.setKhoaHoc(svdt.getKhoaHoc());
		sv.setQuequan(svdt.getQuequan());
		sv.setAvatar(svdt.getAvatar());
		sv.setStatus(svdt.getStatus());
		sv.setBirthday(svdt.getBirthday());
		sv.setCreated_by(svdt.getCreated_by());
		sv.setCreated_at(svdt.getCreated_at());
		sv.setUpdated_at(svdt.getUpdated_at());
		return svd.update(sv, id);
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SinhVienDTO getById(String id) {
		// TODO Auto-generated method stub
		SinhVienDTO svdt = new SinhVienDTO();
		SinhVien sv = svd.getBySinhVienid(id);
		svdt.setId(sv.getId());
		svdt.setMasv(sv.getMasv());
		svdt.setTenSV(sv.getTenSV());
		svdt.setKhoa(sv.getKhoa());
		svdt.setKhoaHoc(sv.getKhoaHoc());
		svdt.setQuequan(sv.getQuequan());
		svdt.setAvatar(sv.getAvatar());
		svdt.setStatus(sv.getStatus());
		svdt.setBirthday(sv.getBirthday());
		svdt.setCreated_by(sv.getCreated_by());
		svdt.setCreated_at(sv.getCreated_at());
		svdt.setUpdated_at(sv.getUpdated_at());
		return svdt;
	}

}
