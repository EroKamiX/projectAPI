package org.backend.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.chamDiemDAO;
import org.backend.Entity.chamDiem;
import org.backend.Models.chamDiemDTO;
import org.backend.Service.chamDiemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class chamDiemServiceImpl implements chamDiemService{

	@Autowired
	chamDiemDAO cddi;
	
	@Override
	public List<chamDiemDTO> getAll() {
		// TODO Auto-generated method stub
		List<chamDiemDTO> ls = new ArrayList();
		for (chamDiem cd : cddi.getAll()) {
			chamDiemDTO cdt = new chamDiemDTO();
			cdt.setId(cd.getId());
			cdt.setStudentId(cd.getStudentId());
			cdt.setBaitapid(cd.getBaitapid());
			cdt.setDiem(cd.getDiem());
			cdt.setThangDiem(cd.getThangDiem());
			ls.add(cdt);
		}
		return ls;
	}

	@Override
	public boolean insert(chamDiemDTO cdt) {
		// TODO Auto-generated method stub
		chamDiem cd = new chamDiem();
		cd.setId(cdt.getId());
		cd.setStudentId(cdt.getStudentId());
		cd.setBaitapid(cdt.getBaitapid());
		cd.setDiem(cdt.getDiem());
		cd.setThangDiem(cdt.getThangDiem());
		return cddi.insert(cd);
	}

	@Override
	public boolean update(chamDiemDTO cdt, String id) {
		// TODO Auto-generated method stub
		chamDiem cd = new chamDiem();
		cd.setId(cdt.getId());
		cd.setStudentId(cdt.getStudentId());
		cd.setBaitapid(cdt.getBaitapid());
		cd.setDiem(cdt.getDiem());
		cd.setThangDiem(cdt.getThangDiem());
		return cddi.update(cd, id);
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public chamDiemDTO getById(int id) {
		// TODO Auto-generated method stub
		chamDiemDTO cdt = new chamDiemDTO();
		chamDiem cd = cddi.getById(id);
		cdt.setId(cd.getId());
		cdt.setStudentId(cd.getStudentId());
		cdt.setBaitapid(cd.getBaitapid());
		cdt.setDiem(cd.getDiem());
		cdt.setThangDiem(cd.getThangDiem());
		return cdt;
	}

}
