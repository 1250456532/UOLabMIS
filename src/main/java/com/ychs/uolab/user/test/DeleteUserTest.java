package com.ychs.uolab.user.test;
/*
 *  中北大学 版权所有 2020-2025
 */

import com.ychs.uolab.user.service.UserService;
import com.ychs.uolab.user.service.UserServiceImpl;

import java.util.Scanner;

/**
 * @author 杨佳雨
 * @version 1.0
 */
public class DeleteUserTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户编号：");
        String userid = sc.next();

        UserService us = new UserServiceImpl();
        int count = us.deleteUser(userid);
        System.out.println(count);
    }
}
