package org.backend.DAO;

import org.backend.Entity.baiTap;
import org.backend.Entity.files;
import org.backend.Entity.studentBaiTap;
import org.backend.Models.filesDTO;

import java.util.List;

public interface getDAOVoVan {
    baiTap getByNotification(String idlop, String username);
    studentBaiTap getByUserNameAndLopTinChiSBT(String username, int idbaitap);
    List<files> getFileByBaiTapId(int id);
}
