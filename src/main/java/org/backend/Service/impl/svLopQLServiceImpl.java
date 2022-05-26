package org.backend.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.svLopQLDAO;
import org.backend.Entity.svLopQL;
import org.backend.Models.svLopQLDTO;
import org.backend.Service.svLopQLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class svLopQLServiceImpl implements svLopQLService{

	@Autowired
	svLopQLDAO slqda;

	@Override
	public List<svLopQLDTO> getAll() {
		// TODO Auto-generated method stub
		List<svLopQLDTO> ls = new ArrayList<>();
		for (svLopQL slq : slqda.getAll()) {
			svLopQLDTO slqd = new svLopQLDTO();
			slqd.setId(slq.getId());
			slqd.setMasv(slq.getMasv());
			slqd.setMaLopQL(slq.getMaLopQL());
			slqd.setStatus(slq.getStatus());
			slqd.setCreated_by(slq.getCreated_by());
			slqd.setCreated_at(slq.getCreated_at());
			slqd.setUpdated_at(slq.getUpdated_at());
			ls.add(slqd);
		}
		return ls;
	}

	@Override
	public boolean insert(svLopQLDTO svlq) {
		// TODO Auto-generated method stub
		svLopQL slq = new svLopQL();
		slq.setId(svlq.getId());
		slq.setMasv(svlq.getMasv());
		slq.setMaLopQL(svlq.getMaLopQL());
		slq.setStatus(svlq.getStatus());
		slq.setCreated_by(svlq.getCreated_by());
		slq.setCreated_at(svlq.getCreated_at());
		slq.setUpdated_at(svlq.getUpdated_at());
		return slqda.insert(slq);
	}

	@Override
	public boolean update(svLopQLDTO svlq, String id) {
		// TODO Auto-generated method stub
		svLopQL slq = new svLopQL();
		slq.setId(svlq.getId());
		slq.setMasv(svlq.getMasv());
		slq.setMaLopQL(svlq.getMaLopQL());
		slq.setStatus(svlq.getStatus());
		slq.setCreated_by(svlq.getCreated_by());
		slq.setCreated_at(svlq.getCreated_at());
		slq.setUpdated_at(svlq.getUpdated_at());
		return slqda.update(id, slq);
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public svLopQLDTO getById(String id) {
		// TODO Auto-generated method stub
		svLopQLDTO slqd = new svLopQLDTO();
		svLopQL slq = slqda.getById(id);
		slqd.setId(slq.getId());
		slqd.setMasv(slq.getMasv());
		slqd.setMaLopQL(slq.getMaLopQL());
		slqd.setStatus(slq.getStatus());
		slqd.setCreated_by(slq.getCreated_by());
		slqd.setCreated_at(slq.getCreated_at());
		slqd.setUpdated_at(slq.getUpdated_at());
		return slqd;
	}

}
