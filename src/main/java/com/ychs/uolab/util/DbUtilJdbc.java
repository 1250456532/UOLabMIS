/*
 *  中北大学 版权所有 2020-2025
 */
package com.ychs.uolab.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *（此处写的是下面这个类的功能）实现数据库的连接与关闭
 * @author 杨佳雨
 * @version 1.0
 */
public class DbUtilJdbc {
	/**
	 * 获得数据库连接
	 * @return 得到数据库连接对象
	 */
	public static Connection getConnection(){
		//声明连接变量
		Connection conn = null; 
		//注册数据库驱动程序：mysql 5 的驱动
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//获取链接
			//3306是数据库端口
			//localhost是本机
			//jdbc 协议   MySQL子协议
			String url = "jdbc:mysql://localhost:3306/uolabdb?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
			//DriverManager 驱动程序管理类
			conn = DriverManager.getConnection(url,"root","y17635625275");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn ;
	}
	/**
	 * 关闭指定的数据库连接
	 * @param conn 数据库连接对象
	 */
	public static void closeConnection(Connection conn) {
		//防止空指针异常发生
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	/**
	 * 单元测试，测试个方法能不能用
	 * @param args 测试方法
	 */
	public static void main(String[] args) {
		Connection conn = DbUtilJdbc.getConnection();
		//内存泄漏
		System.out.println(conn);
	}

}
