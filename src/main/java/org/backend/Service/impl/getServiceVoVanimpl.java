package org.backend.Service.impl;

import org.backend.DAO.getDAOVoVan;
import org.backend.Entity.baiTap;
import org.backend.Entity.files;
import org.backend.Entity.studentBaiTap;
import org.backend.Models.baiTapDTO;
import org.backend.Models.filesDTO;
import org.backend.Models.studentBaiTapDTO;
import org.backend.Service.getServiceVoVan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class getServiceVoVanimpl implements getServiceVoVan {

    @Autowired
    getDAOVoVan gdvv;

    @Override
    public baiTapDTO getByNotification(String idlop, String username) {
        baiTapDTO btd = new baiTapDTO();
        baiTap bt = gdvv.getByNotification(idlop, username);
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

    @Override
    public studentBaiTapDTO getByUserNameAndLopTinChiSBT(String username, int idbaitap) {
        studentBaiTapDTO sbtd = new studentBaiTapDTO();
        studentBaiTap sbt = gdvv.getByUserNameAndLopTinChiSBT(username, idbaitap);
        sbtd.setId(sbt.getId());
        sbtd.setUsername(sbt.getUsername());
        sbtd.setBaiTapId(sbt.getBaiTapId());
        sbtd.setLienket(sbt.getLienket());
        return sbtd;
    }

    @Override
    public List<filesDTO> getFileByBaiTapId(int id) {
        List<filesDTO> ls = new ArrayList();
        for (files f : gdvv.getFileByBaiTapId(id)) {
            filesDTO fdt = new filesDTO();
            fdt.setId(f.getId());
            fdt.setFilename(f.getFilename());
            fdt.setBaiTapId(f.getBaiTapId());
            fdt.setNopBaiTapId(f.getNopBaiTapId());
            ls.add(fdt);
        }
        return ls;
    }
}
