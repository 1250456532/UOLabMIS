package com.ychs.uolab.competiton.dao;
/*
 *  中北大学 版权所有 2020-2025
 */

import com.ychs.uolab.competiton.vo.Competition;
import com.ychs.uolab.util.Dbutil;

import java.awt.dnd.DnDConstants;
import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author 杨佳雨
 * @version 1.0
 */
public class CompetitionDaoImpl implements CompetitionDao {

    @Override
    public int selectInformation(String date) {
        return 0;
    }

    @Override
    public int updateInformation(Competition competition) {
        Connection conn = Dbutil.getConnection();
        PreparedStatement pstmt = null;
        String sql = "UPDATE t_competition SET groupmember=?,award=?,c_id=? WHERE c_id =" + competition.getcId();
        int count = 0;

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,competition.getGroupMember());
            pstmt.setString(2,competition.getAward());
            pstmt.setInt(3,competition.getcId());
            count = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Dbutil.closeResource(null,pstmt,conn);
        }
        return count;

    }

    @Override
    public int addInformation(Competition competition) {
        Connection conn = Dbutil.getConnection();
        PreparedStatement pstmt = null;
        int count = 0;

        String sql = "INSERT INTO t_competition VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,competition.getcId());
            pstmt.setString(2,competition.getCategories());
            pstmt.setString(3,competition.getYear());
            pstmt.setString(4,competition.getTopic());
            pstmt.setString(5,competition.getGroupLeader());
            pstmt.setString(6,competition.getGroupMember());
            pstmt.setString(7,competition.getAward());
            pstmt.setString( 8,competition.getAdviser());
            pstmt.setString(9,competition.getRemark());
            count = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Dbutil.closeResource(null,pstmt,conn);
        }

        return count;
    }
}
