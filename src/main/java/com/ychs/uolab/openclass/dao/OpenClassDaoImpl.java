package com.ychs.uolab.openclass.dao;
/*
 *  中北大学 版权所有 2020-2025
 */

import com.ychs.uolab.openclass.vo.OpenClass;
import com.ychs.uolab.util.Dbutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author 杨佳雨
 * @version 1.0
 */
public class OpenClassDaoImpl implements OpenClassDao {
    @Override
    public int selectOpenClass(String date, String dname, String grade, String major) {
        int count = 0;
        return count;
    }

    @Override
    public int insertOpenClass(OpenClass openClass) {

        Connection conn = Dbutil.getConnection();
        PreparedStatement pstmt = null;
        int count = 0;

        String sql = "INSERT INTO t_openclass values (?,?,?,?,?,?,?,?,?,?,?)";

        try {
            pstmt =conn.prepareStatement(sql);
            pstmt.setInt(1,openClass.getCid());
            pstmt.setString(2,openClass.getCourseDate());
            pstmt.setString(3,openClass.getSpecial());
            pstmt.setString(4,openClass.getSpeaker());
            pstmt.setString(5,openClass.getOrganizer());
            pstmt.setString(6,openClass.getSite());
            pstmt.setString(7,openClass.getGroupShow());
            pstmt.setString(8,openClass.getWay());
            pstmt.setInt(9,openClass.getCredit());
            pstmt.setInt(10,openClass.getNum());
            pstmt.setString(11,openClass.getRemark());

            count = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Dbutil.closeResource(null,pstmt,conn);
        }
        return count;
    }
}
