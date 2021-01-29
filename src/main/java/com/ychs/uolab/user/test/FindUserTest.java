package com.ychs.uolab.user.test;
/*
 *  中北大学 版权所有 2020-2025
 */

import com.ychs.uolab.user.service.UserService;
import com.ychs.uolab.user.service.UserServiceImpl;
import com.ychs.uolab.user.vo.User;

import java.util.List;

/**
 * @author 杨佳雨
 * @version 1.0
 */
public class FindUserTest {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        //System.out.println("输入用户名：");
        //String uname = sc.next();
        String uname = "杨佳雨";

        //System.out.println("输入院系：");
        //String dname = sc.next();
        String dname = null;

        //System.out.println("输入专业：");
        //String major = sc.next();
        String major = null;

        //System.out.println("输入班级：");
        //String classes = sc.next();
        String classes = null;

        //System.out.println("输入年级：");
        //String grade = sc.next();
        String grade = "2019";

        UserService us = new UserServiceImpl();
        List<User> ulist = us.findUser(uname, dname, major, classes, grade);
        System.out.println(ulist.size());
        for (int i = 0; i < ulist.size(); i++) {
            User user = ulist.get(i);
            System.out.println(user);
        }
    }
}