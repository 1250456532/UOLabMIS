/*
 *  中北大学 版权所有 2020-2025
 */
package com.ychs.uolab.user.dao;

import com.ychs.uolab.user.vo.User;
import com.ychs.uolab.util.Dbutil;
import com.ychs.uolab.util.Md5Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 杨佳雨
 * @version 1.0
 */
public class UserDaoImpl implements UserDao {

    @Override
    public List<User> selectUser(String uname, String dname, String major, String classes, String grade) {
        Connection conn = Dbutil.getConnection();
        //非预编译对象
        Statement stmt = null;
        ResultSet rs = null;
        List<User> userList = new ArrayList<>();
        //因为我们不知道用户填了哪几个条件，所以SQL语句是动态变化的
        String sql = "SELECT * FROM t_user WHERE 1=1 ";
        //可变字符串类
        StringBuilder strBuilder = new StringBuilder(sql);
        if (uname != null) {
            strBuilder.append(" AND username='" + uname + "'");
        }
        if (dname != null) {
            strBuilder.append(" AND dname='" + dname + "'");
        }
        if (major != null) {
            strBuilder.append(" AND major_name='" + major + "'");
        }
        if (classes != null) {
            strBuilder.append(" AND cname='" + classes + "'");
        }
        if (grade != null) {
            strBuilder.append(" AND grade='" + grade + "'");
        }
        sql = strBuilder.toString();
        System.out.println(sql);
        try {
            stmt = conn.createStatement();
            //执行查询
            rs = stmt.executeQuery(sql);
            //把rs结果集里面的数据转移到集合userList中
            while (rs.next()) {
                User user = new User();
                //rs.get里的username是表里的字段
                user.setUsername(rs.getString("username"));
                user.setDname(rs.getString("dname"));
                user.setMajorName(rs.getString("major_name"));
                user.setCname(rs.getString("cname"));
                user.setGrade(rs.getString("grade"));
                user.setTelephone(rs.getString("telephone"));
                user.setQq(rs.getString("qq"));
                user.setDuty(rs.getString("duty"));
                user.setStatus(rs.getString("status"));
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Dbutil.closeResource(rs, null, conn);
        }

        return userList;
    }

    @Override
    public int deleteUser(String userid) {
        Connection conn = Dbutil.getConnection();
        PreparedStatement pstmt = null;
        int count = 0;
        String sql = "DELETE FROM  t_user WHERE uid=?";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(userid));
            count = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Dbutil.closeResource(null, pstmt, conn);
        }

        return count;
    }

    @Override
    public int updateUser(User user) {
        Connection conn = Dbutil.getConnection();
        PreparedStatement pstmt = null;

        String sql = "UPDATE t_user SET telephone=?,qq=?,duty=?,remark=?,uid=? where uid =" + user.getUid();
        int count = 0;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, user.getTelephone());
            pstmt.setString(2, user.getQq());
            pstmt.setString(3, user.getDuty());
            pstmt.setString(4, user.getRemark());
            pstmt.setInt(5, user.getUid());
            //count表示的是执行的SQL影响到的记录行数
            count = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Dbutil.closeResource(null, pstmt, conn);
        }
        return count;
    }


    @Override
    public boolean login(String userName, String userPsw) {
        //数据库连接
        Connection conn = null;
        //查询得到的结果
        ResultSet rs = null;
        //准备并执行SQL语句
        PreparedStatement pstmt = null;
        //登录是否成功的标志
        boolean loginFlag = false;
        //打开数据库连接
        conn = Dbutil.getConnection();
        //准备SELECT语句

        String sql = "SELECT * FROM t_user WHERE username=? AND  password=?";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, userName);
            pstmt.setString(2, userPsw);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                loginFlag = true;
            }
        } catch (Exception throwables) {
            throwables.printStackTrace();
        } finally {
            //释放资源
            Dbutil.closeResource(rs, pstmt, conn);
        }

        return loginFlag;
    }

    @Override
    public boolean insertUser(User user) {
        boolean flag = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        conn = Dbutil.getConnection();
        String sql = "INSERT INTO t_user VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, user.getUid());
            pstmt.setString(2, user.getUsername());
            pstmt.setString(3, Md5Util.getMD5(user.getPassword()));
            pstmt.setString(4, user.getRealname());
            pstmt.setString(5, user.getSex());
            pstmt.setString(6, user.getTelephone());
            pstmt.setString(7, user.getDname());
            pstmt.setString(8, user.getMajorName());
            pstmt.setString(9, user.getCname());
            pstmt.setString(10, user.getGrade());
            pstmt.setString(11, user.getDuty());
            pstmt.setString(12, user.getQq());
            pstmt.setString(13, user.getStatus());
            pstmt.setString(14, user.getRemark());
            //这个方法执行的是insert，update，delete语句
            //如果执行成功，返回非0 int
            int count = pstmt.executeUpdate();
            if (count != 0) {
                //添加成功flag是true
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Dbutil.closeResource(null, pstmt, conn);
        }

        return flag;
    }
}
