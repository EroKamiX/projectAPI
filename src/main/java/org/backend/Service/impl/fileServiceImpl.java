package org.backend.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.filesDAO;
import org.backend.Entity.files;
import org.backend.Models.filesDTO;
import org.backend.Service.fileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class fileServiceImpl implements fileService{

	@Autowired
	filesDAO fd;
	
	@Override
	public List<filesDTO> getAll() {
		// TODO Auto-generated method stub
		List<filesDTO> ls = new ArrayList();
		for (files f : fd.getAll()) {
			filesDTO fdt = new filesDTO();
			fdt.setId(f.getId());
			fdt.setFilename(f.getFilename());
			fdt.setBaiTapId(f.getBaiTapId());
			fdt.setNopBaiTapId(f.getNopBaiTapId());
			ls.add(fdt);
		}
		return ls;
	}

	@Override
	public boolean insert(filesDTO ftd) {
		// TODO Auto-generated method stub
		files f = new files();
		f.setId(ftd.getId());
		f.setFilename(ftd.getFilename());
		f.setBaiTapId(ftd.getBaiTapId());
		f.setNopBaiTapId(ftd.getNopBaiTapId());
		return fd.insert(f);
	}

	@Override
	public boolean update(filesDTO ftd, String id) {
		// TODO Auto-generated method stub
		files f = new files();
		f.setId(ftd.getId());
		f.setFilename(ftd.getFilename());
		f.setBaiTapId(ftd.getBaiTapId());
		f.setNopBaiTapId(ftd.getNopBaiTapId());
		return fd.update(id, f);
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public filesDTO getById(String id) {
		// TODO Auto-generated method stub
		filesDTO fdt = new filesDTO();
		files f = fd.getById(id);
		fdt.setId(f.getId());
		fdt.setFilename(f.getFilename());
		fdt.setBaiTapId(f.getBaiTapId());
		fdt.setNopBaiTapId(f.getNopBaiTapId());
		return fdt;
	}

}
