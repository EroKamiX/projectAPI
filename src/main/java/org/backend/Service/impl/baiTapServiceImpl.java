package org.backend.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.backend.DAO.baiTapDAO;
import org.backend.Entity.baiTap;
import org.backend.Models.baiTapDTO;
import org.backend.Service.baiTapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class baiTapServiceImpl implements baiTapService{

	@Autowired
	baiTapDAO btda;
	
	@Override
	public List<baiTapDTO> getAll(String id, String monhoc) {
		List<baiTapDTO> ls = new ArrayList<>();
        for (baiTap bt : btda.getAll(id, monhoc)) {
            baiTapDTO btd = new baiTapDTO();
            btd.setId(bt.getId());
            btd.setName(bt.getName());
            btd.setUsername(bt.getUsername());
            btd.setDeadline(bt.getDeadline());
            btd.setTenBaiTap(bt.getTenBaiTap());
            btd.setNoiDungBaiTap(bt.getNoiDungBaiTap());
            btd.setLoptinchi(bt.getLoptinchi());
            btd.setLopql(bt.getLopql());
            btd.setThangDiem(bt.getThangDiem());
            ls.add(btd);
        }
        return ls;
	}

    @Override
	public List<baiTapDTO> getAll() {
		List<baiTapDTO> ls = new ArrayList<>();
        for (baiTap bt : btda.getAll()) {
            baiTapDTO btd = new baiTapDTO();
            btd.setId(bt.getId());
            btd.setName(bt.getName());
            btd.setUsername(bt.getUsername());
            btd.setDeadline(bt.getDeadline());
            btd.setTenBaiTap(bt.getTenBaiTap());
            btd.setNoiDungBaiTap(bt.getNoiDungBaiTap());
            btd.setLoptinchi(bt.getLoptinchi());
            btd.setLopql(bt.getLopql());
            btd.setThangDiem(bt.getThangDiem());
            ls.add(btd);
        }
        return ls;
	}

	@Override
	public boolean insert(baiTapDTO btd) {
        baiTap bt = new baiTap();
        bt.setId(btd.getId());
        bt.setName(btd.getName());
        bt.setUsername(btd.getUsername());
        bt.setDeadline(btd.getDeadline());
        bt.setTenBaiTap(btd.getTenBaiTap());
        bt.setNoiDungBaiTap(btd.getNoiDungBaiTap());
        bt.setLoptinchi(btd.getLoptinchi());
        bt.setLopql(btd.getLopql());
        bt.setThangDiem(btd.getThangDiem());
		return btda.insert(bt);
	}

	@Override
	public boolean update(String id, baiTapDTO btd) {
        baiTap bt = new baiTap();
        bt.setId(btd.getId());
        bt.setName(btd.getName());
        bt.setUsername(btd.getUsername());
        bt.setDeadline(btd.getDeadline());
        bt.setTenBaiTap(btd.getTenBaiTap());
        bt.setNoiDungBaiTap(btd.getNoiDungBaiTap());
        bt.setLoptinchi(btd.getLoptinchi());
        bt.setLopql(btd.getLopql());
        bt.setThangDiem(btd.getThangDiem());
		return btda.update(id, bt);
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

    @Override
    public int getLastId() {
        return btda.getLastId();
    }

    @Override
	public baiTapDTO getById(int id) {
        baiTapDTO btd = new baiTapDTO();
        baiTap bt = btda.getById(id); 
        btd.setId(bt.getId());
        btd.setName(bt.getName());
        btd.setUsername(bt.getUsername());
        btd.setDeadline(bt.getDeadline());
        btd.setTenBaiTap(bt.getTenBaiTap());
        btd.setNoiDungBaiTap(bt.getNoiDungBaiTap());
        btd.setLoptinchi(bt.getLoptinchi());
        btd.setLopql(bt.getLopql());
        btd.setThangDiem(bt.getThangDiem());
		return btd;
	}
}
