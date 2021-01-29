package com.ychs.uolab.user.test;
/*
 *  中北大学 版权所有 2020-2025
 */

import com.ychs.uolab.user.service.UserService;
import com.ychs.uolab.user.service.UserServiceImpl;
import com.ychs.uolab.user.vo.User;

import java.util.Scanner;

/**
 * @author 杨佳雨
 * @version 1.0
 */
public class ModifyUserTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户编号:");
        int userid = sc.nextInt();
        System.out.println("请输入电话:");
        String tel = sc.next();
        System.out.println("请输入QQ:");
        String qq = sc.next();
        System.out.println("请输入职务");
        String duty = sc.next();
        System.out.println("请输入备注");
        String remark = sc.next();

        User user = new User();
        user.setTelephone(tel);
        user.setQq(qq);
        user.setDuty(duty);
        user.setRemark(remark);
        user.setUid(userid);

        UserService us = new UserServiceImpl();
        int count = us.modifyUser(user);
        if (count != 0) {
            System.out.println("修改成功!");
        } else {
            System.out.println("修改失败!");
        }

    }

}
