package com.ychs.uolab.user.service;
/*
 *  中北大学 版权所有 2020-2025
 */

import com.ychs.uolab.user.vo.User;

import java.util.List;

/**
 * 用户业务接口
 * @author 杨佳雨
 * @version 1.0
 */
public interface UserService {
    /**
     * 组合条件
     * @param uname 姓名
     * @param dname 院系
     * @param major 专业
     * @param classes 班级
     * @param grade 年级
     * @return 满足条件的对象组成的集合
     */
    public List<User> findUser(String uname, String dname,String major, String classes, String grade);
    /**
     * 按编号删除
     * @param userid 用户编号
     * @return 删除成功返回1；失败返回0
     */
    public  int deleteUser(String userid);
    /**
     * 修改用户信息
     * @param user 用户对象
     * @return 成功返回true，失败返回0
     */
    public  int modifyUser(User user);
    /**
     * 添加用户
     * @param user 用户对象
     * @return 添加成功返回true，否则返回false
     */
    public boolean addUser(User user);

    /**
     * 按用户名和密码检查用户，登录
     * @param userName 用户名
     * @param userPsw 密码
     * @return 登录成功返回true，否则返回false
     */
    public  boolean checkUser(String userName,String userPsw);
}
