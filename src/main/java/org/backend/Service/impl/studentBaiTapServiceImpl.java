package org.backend.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.studentBaiTapDAO;
import org.backend.Entity.studentBaiTap;
import org.backend.Models.studentBaiTapDTO;
import org.backend.Service.studentBaiTapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentBaiTapServiceImpl implements studentBaiTapService{

	@Autowired
	studentBaiTapDAO stbt;

	@Override
	public List<studentBaiTapDTO> getAll() {
		return null;
	}

	@Override
	public List<studentBaiTapDTO> getByUserName(String username) {
		return null;
	}

	@Override
	public List<studentBaiTapDTO> getByBaiTapId(int id) {
		List<studentBaiTapDTO> lsbtdo = new ArrayList<>();
		for (studentBaiTap stb : stbt.getByBaiTapId(id)) {
			studentBaiTapDTO sbtdo = new studentBaiTapDTO();
			sbtdo.setId(stb.getId());
			sbtdo.setUsername(stb.getUsername());
			sbtdo.setBaiTapId(stb.getBaiTapId());
			sbtdo.setLienket(stb.getLienket());
			lsbtdo.add(sbtdo);
		}
		return lsbtdo;
	}

	@Override
	public int getLastId() {
		return stbt.getLastId();
	}

	@Override
	public boolean insertWithFile(studentBaiTapDTO sbtdto) {
		studentBaiTap stb = new studentBaiTap();
		stb.setUsername(sbtdto.getUsername());
		stb.setBaiTapId(sbtdto.getBaiTapId());
		stb.setLienket(sbtdto.getLienket());
		return stbt.insertWithFile(stb);
	}

}
