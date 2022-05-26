package org.backend.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.bangCapDAO;
import org.backend.Entity.bangCap;
import org.backend.Models.bangCapDTO;
import org.backend.Service.bangCapSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bangCapServiceImpl implements bangCapSevice{

	@Autowired
	bangCapDAO bcda;
	
	@Override
	public List<bangCapDTO> getAll() {
		// TODO Auto-generated method stub
		List<bangCapDTO> ls = new ArrayList();
		for (bangCap bc : bcda.getAll()) {
			bangCapDTO bcd = new bangCapDTO();
			bcd.setId(bc.getId());
			bcd.setTenBangCap(bc.getTenBangCap());
			bcd.setCreated_by(bc.getCreated_by());
			bcd.setCreated_at(bc.getCreated_at());
			bcd.setUpdated_at(bc.getUpdated_at());
			ls.add(bcd);
		}
		return ls;
	}

	@Override
	public boolean insert(bangCapDTO bcd) {
		// TODO Auto-generated method stub
		bangCap bc = new bangCap();
		bc.setId(bcd.getId());
		bc.setTenBangCap(bcd.getTenBangCap());
		bc.setCreated_by(bcd.getCreated_by());
		bc.setCreated_at(bcd.getCreated_at());
		bc.setUpdated_at(bcd.getUpdated_at());
		return bcda.insert(bc);
	}

	@Override
	public boolean update(bangCapDTO bcd, String id) {
		// TODO Auto-generated method stub
		bangCap bc = new bangCap();
		bc.setId(bcd.getId());
		bc.setTenBangCap(bcd.getTenBangCap());
		bc.setCreated_by(bcd.getCreated_by());
		bc.setCreated_at(bcd.getCreated_at());
		bc.setUpdated_at(bcd.getUpdated_at());
		return bcda.update(bc, id);
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public bangCapDTO getById(String id) {
		// TODO Auto-generated method stub
		bangCapDTO btd = new bangCapDTO();
		bangCap bc = bcda.getById(id);
		btd.setId(bc.getId());
		btd.setTenBangCap(bc.getTenBangCap());
		btd.setCreated_by(bc.getCreated_by());
		btd.setCreated_at(bc.getCreated_at());
		btd.setUpdated_at(bc.getUpdated_at());
		return btd;
	}

}
