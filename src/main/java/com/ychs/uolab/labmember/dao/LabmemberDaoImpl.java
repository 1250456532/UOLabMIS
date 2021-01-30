package com.ychs.uolab.labmember.dao;
/*
 *  中北大学 版权所有 2020-2025
 */

import com.ychs.uolab.deparement.vo.Dept;
import com.ychs.uolab.deparement.vo.Major;
import com.ychs.uolab.labmember.vo.Member;
import com.ychs.uolab.util.Dbutil;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 杨佳雨
 * @version 1.0
 */
public class LabmemberDaoImpl implements LabmemberDao {
    /**
     * 先按参数查询结果得到四个Member集合，再导出Excel
     */
    @Override
    public File statisticsMember(String dName, String grade, String majorName, String remark) {
        return null;
    }

    @Override
    public List<Member> selectMember(String stuName, String grade, String telephone, String dName, String majorName, String status, String labJob) {

        Connection connection = Dbutil.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Member> memberList = new ArrayList<Member>();
        String sql = "SELECT\n" +
                "t_labmember.stu_name,\n" +
                "t_labmember.grade,\n" +
                "t_labmember.telephone,\n" +
                "t_department.dname,\n" +
                "t_major.major_name,\n" +
                "t_labmember.`status`,\n" +
                "t_labmember.lab_job\n" +
                "FROM\n" +
                "t_labmember\n" +
                "INNER JOIN t_class ON t_labmember.cno = t_class.cno\n" +
                "INNER JOIN t_major ON t_class.major_id = t_major.major_id\n" +
                "INNER JOIN t_department ON t_major.did = t_department.did";
        System.out.println(sql);

        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery(sql);
            while (resultSet.next()){
                Member member = new Member();
                Dept dept = new Dept();
                Major major = new Major();

                member.setStuName(resultSet.getString("stu_name"));
                member.setGrade(resultSet.getString("grade"));
                member.setTelephone(resultSet.getString("telephone"));
                dept.setDname(resultSet.getString("dname"));
                major.setMajorName(resultSet.getString("major_name"));
                member.setStatus(resultSet.getString("status"));
                member.setLabJob(resultSet.getString("lab_job"));
                member.setDept(dept);
                member.setMajor(major);
                memberList.add(member);


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return memberList;
    }

    @Override
    public int updateMember(Member member) {
        Connection conn = Dbutil.getConnection();
        PreparedStatement pstmt = null;
        int count = 0;

        String sql = "UPDATE t_labmember SET telephone=?,campus_post=?,status=?,lab_job=?,remark=? WHERE member_id=? ";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, member.getTelephone());
            pstmt.setString(2, member.getCampusPost());
            pstmt.setString(3, member.getStatus());
            pstmt.setString(4, member.getLabJob());
            pstmt.setString(5, member.getRemark());
            pstmt.setInt(6, member.getMemberId());
            count = pstmt.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            Dbutil.closeResource(null, pstmt, conn);
        }

        return count;
    }


    @Override
    public int insertMember(Member member) {
        // TODO Auto-generated method stub
        Connection conn = Dbutil.getConnection();
        PreparedStatement preparedStatement = null;
        int count = 0;

        String sql = "insert into t_labmember values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, member.getMemberId());
            preparedStatement.setInt(2, member.getCno());
            preparedStatement.setString(3, member.getStuName());
            preparedStatement.setString(4, member.getStuId());
            preparedStatement.setString(5, member.getSex());
            preparedStatement.setString(6, member.getGrade());
            preparedStatement.setString(7, member.getNativePlace());
            preparedStatement.setString(8, member.getTelephone());
            preparedStatement.setString(9, member.getEmail());
            preparedStatement.setString(10, member.getCampusPost());
            preparedStatement.setString(11, member.getJoiningDate());
            preparedStatement.setString(12, member.getStatus());
            preparedStatement.setString(13, member.getLabJob());
            preparedStatement.setString(14, member.getRemark());
            count = preparedStatement.executeUpdate();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            Dbutil.closeResource(null, preparedStatement, conn);
        }
        return count;
    }
}
