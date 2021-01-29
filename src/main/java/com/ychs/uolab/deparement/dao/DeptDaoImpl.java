package com.ychs.uolab.deparement.dao;
/*
 *  中北大学 版权所有 2020-2025
 */

import com.ychs.uolab.deparement.vo.Dept;
import com.ychs.uolab.deparement.vo.Major;
import com.ychs.uolab.util.Dbutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * DeptDao 实现类
 * @author 杨佳雨
 * @version 1.0
 */
public class DeptDaoImpl implements DeptDao{


    @Override
    public int insertMajor(Major major) {
        int flag = 0;

        Connection conn = Dbutil.getConnection();
        PreparedStatement pstmt = null;
        String sql = "INSERT INTO t_major VALUES(?,?,?,?)";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,major.getMajorId());
            pstmt.setInt(2,major.getDid());
            pstmt.setString(3, major.getMajorName());
            pstmt.setString(4, major.getRemark());
            flag = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Dbutil.closeResource(null,pstmt,conn);
        }


        return flag;
    }

    @Override
    public int insertDept(Dept dept) {
        Connection conn = Dbutil.getConnection();
        PreparedStatement pstmt = null;
        int flag = 0;

        String sql = "INSERT INTO t_department VALUES(?,?,?)";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,dept.getDid());
            pstmt.setString(2, dept.getDname());
            pstmt.setString(3, dept.getRamark());
            flag =pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Dbutil.closeResource(null,pstmt,null);
        }

        return flag;
    }
}
