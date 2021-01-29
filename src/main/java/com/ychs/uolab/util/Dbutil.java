package com.ychs.uolab.util;
/*
 *  中北大学 版权所有 2020-2025
 */

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 数据连接实用类
 *
 * @author 杨佳雨
 * @version 1.0
 */
public class Dbutil {

    static DataSource ds;

    //static在类加载时就执行，往JVM里加载
    //static里面不能使用非static属性
    static {
        Properties pro = new Properties();
        //配置文件必须放在src目录下
        InputStream is = Dbutil.class.getClassLoader().getResourceAsStream("druid.properties");
        try {
            //读取配置文件
            pro.load(is);
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public static Connection getConnection(){

        Connection conn = null;
        try {
            conn = ds.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return  conn;
    }


    public static void closeResource(ResultSet rs, PreparedStatement pstmt,Connection conn){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(pstmt!=null){
            try {
                pstmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Connection connection = Dbutil.getConnection();
        System.out.println(connection);
    }
}
