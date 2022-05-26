package org.backend.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.dangHocDAO;
import org.backend.Entity.dangHoc;
import org.backend.Models.dangHocDTO;
import org.backend.Service.dangHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class dangHocServiceImpl implements dangHocService{

	@Autowired
	dangHocDAO dhd;
	
	@Override
	public List<dangHocDTO> getAll() {
		// TODO Auto-generated method stub
		List<dangHocDTO> ls = new ArrayList();
		for (dangHoc dh : dhd.getAll()) {
			dangHocDTO dht = new dangHocDTO();
			dht.setId(dh.getId());
			dht.setClassId(dh.getClassId());
			dht.setIdMon(dh.getIdMon());
			dht.setIdTeacher(dh.getIdTeacher());
			ls.add(dht);
		}
		return ls;
	}

	@Override
	public boolean insert(dangHocDTO dhtd) {
		// TODO Auto-generated method stub'
		dangHoc dh = new dangHoc();
		dh.setId(dhtd.getId());
		dh.setClassId(dhtd.getClassId());
		dh.setIdMon(dhtd.getIdMon());
		dh.setIdTeacher(dhtd.getIdTeacher());
		return dhd.insert(dh);
	}

	@Override
	public boolean update(dangHocDTO dhtd, String id) {
		// TODO Auto-generated method stub
		dangHoc dh = new dangHoc();
		dh.setId(dhtd.getId());
		dh.setClassId(dhtd.getClassId());
		dh.setIdMon(dhtd.getIdMon());
		dh.setIdTeacher(dhtd.getIdTeacher());
		return dhd.update(dh, id);
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public dangHocDTO getById(String id) {
		// TODO Auto-generated method stub
		dangHoc dh = dhd.getById(id);
		dangHocDTO dht = new dangHocDTO();
		dht.setId(dh.getId());
		dht.setClassId(dh.getClassId());
		dht.setIdMon(dh.getIdMon());
		dht.setIdTeacher(dh.getIdTeacher());
		return dht;
	}

}
