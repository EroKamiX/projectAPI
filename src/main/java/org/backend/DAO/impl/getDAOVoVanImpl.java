package org.backend.DAO.impl;

import org.backend.DAO.getDAOVoVan;
import org.backend.Entity.baiTap;
import org.backend.Entity.files;
import org.backend.Entity.studentBaiTap;
import org.backend.Models.filesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class getDAOVoVanImpl implements getDAOVoVan {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public baiTap getByNotification(String idlop, String username) {
        String sql = "SELECT * FROM baiTap WHERE deadline > CURDATE() AND loptinchiid = ? ORDER BY deadline ASC LIMIT 1";
        return jdbcTemplate.query(sql, new ResultSetExtractor<baiTap>() {
            @Override
            public baiTap extractData(ResultSet rs) throws SQLException, DataAccessException {
                baiTap bt = new baiTap();
                while (rs.next()) {
                    bt.setId(rs.getInt("id"));
                    bt.setUsername(rs.getString("username"));
                    bt.setDeadline(rs.getString("deadline"));
                    bt.setTenBaiTap(rs.getString("tenBaiTap"));
                    bt.setNoiDungBaiTap(rs.getString("noiDungBaiTap"));
                    bt.setLoptinchi(rs.getString("loptinchiid"));
                    bt.setLopql(rs.getString("lopql"));
                    bt.setThangDiem(rs.getInt("thangDiem"));
                }
                return bt;
            }
        }, idlop);
    }

    @Override
    public studentBaiTap getByUserNameAndLopTinChiSBT(String username, int idbaitap) {
        String sql = "SELECT * FROM studentBaiTap where username = ? and baiTapId = ?";
        return jdbcTemplate.query(sql, new ResultSetExtractor<studentBaiTap>() {
            @Override
            public studentBaiTap extractData(ResultSet rs) throws SQLException, DataAccessException {
                studentBaiTap bt = new studentBaiTap();
                while (rs.next()) {
                    bt.setId(rs.getInt("id"));
                    bt.setUsername(rs.getString("username"));
                    bt.setLienket(rs.getString("lienket"));
                    bt.setBaiTapId(rs.getInt("baiTapId"));
                }
                return bt;
            }
        }, username, idbaitap);
    }

    @Override
    public List<files> getFileByBaiTapId(int id) {
        String sql = "SELECT * FROM files WHERE baiTapId = ?";
        return jdbcTemplate.query(sql, new ResultSetExtractor<List<files>>() {
            @Override
            public List<files> extractData(ResultSet rs) throws SQLException, DataAccessException {
                // TODO Auto-generated method stub
                List<files> ls = new ArrayList();
                while (rs.next()) {
                    files f = new files();
                    f.setId(rs.getInt("id"));
                    f.setFilename(rs.getString("filename"));
                    f.setBaiTapId(rs.getInt("baiTapId"));
                    f.setNopBaiTapId(rs.getInt("nopBaiTapId"));
                    ls.add(f);
                }
                return ls;
            }
        }, id);
    }
}
