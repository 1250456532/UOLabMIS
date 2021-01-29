/*
 *  中北大学 版权所有 2020-2025
 */
package com.ychs.uolab.user.dao;


import com.ychs.uolab.user.vo.User;

import java.util.List;

/**
 * UserDao接口，封装对用户的操作
 * @author 杨佳雨
 * @version 1.0
 */
public interface UserDao {

    /**
     * 组合条件查询
     * @param uname 用户名
     * @param dname 院系名称
     * @param major 专业
     * @param classes 班级
     * @param grade 年级
     * @return 查询到的集合List
     */
    public List<User> selectUser(String uname, String dname,String major, String classes, String grade);


    /**
     * 删除用户
     * @param userid 用户编号
     * @return 删除成功返回0，失败返回1
     */
    public int deleteUser(String userid);
    /**
     * 修改用户信息
     * @param user 用户对象
     * @return 修改成功返回1 修改失败返回0
     */
    public int updateUser(User user);
    /**
     * 按用户名和密码登录
     * @param userName 用户名
     * @param userPsw 密码
     * @return 如果登陆成功，返回true，否则返回false
     */
    public boolean login(String userName,String userPsw);

    public boolean insertUser(User user);

}
