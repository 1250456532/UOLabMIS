package com.ychs.uolab.credit.dao;
/*
 *  中北大学 版权所有 2020-2025
 */

import com.sun.xml.internal.ws.message.source.PayloadSourceMessage;
import com.ychs.uolab.credit.vo.Credit;
import com.ychs.uolab.util.Dbutil;

import javax.swing.text.html.HTMLDocument;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author 杨佳雨
 * @version 1.0
 */
public class CreditDaoImpl implements CreditDao {
    @Override
    public int creditStatistics(Credit credit) {
        return 0;
    }

    @Override
    public int selectCredit(Credit credit) {
        return 0;
    }

    @Override
    public int creditEntry(Credit credit) {

        Connection conn = Dbutil.getConnection();
        PreparedStatement pstmt = null;
        int count = 0;

        String sql = "INSERT INTO t_credit VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,credit.creditId);
            pstmt.setInt(2,credit.getMemberId());
            pstmt.setString(3,credit.getStuId());
            pstmt.setString(4,credit.getsName());
            pstmt.setString(5,credit.getGrade());
            pstmt.setString(6,credit.getDept());
            pstmt.setInt(7,credit.getCreditPoints());
            pstmt.setString(8,credit.getSubject());
            pstmt.setString(9,credit.getGetDate());
            pstmt.setString(10,credit.getEntryPerson());
            pstmt.setString(11,credit.getEntryDate());
            pstmt.setString(12,credit.getRemark());
            count = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Dbutil.closeResource(null,pstmt,conn);
        }
        return count;
    }
}
