package org.backend.Service;

import org.backend.Models.baiTapDTO;
import org.backend.Models.filesDTO;
import org.backend.Models.studentBaiTapDTO;

import java.util.List;

public interface getServiceVoVan {
    baiTapDTO getByNotification(String idlop, String username);
    studentBaiTapDTO getByUserNameAndLopTinChiSBT(String username, int idbaitap);
    List<filesDTO> getFileByBaiTapId(int id);
}
