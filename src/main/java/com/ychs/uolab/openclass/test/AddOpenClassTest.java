package com.ychs.uolab.openclass.test;
/*
 *  中北大学 版权所有 2020-2025
 */

import com.ychs.uolab.openclass.service.OpenClassService;
import com.ychs.uolab.openclass.service.OpenClassServiceImpl;
import com.ychs.uolab.openclass.vo.OpenClass;

import java.util.Scanner;

/**
 * @author 杨佳雨
 * @version 1.0
 */
public class AddOpenClassTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入公开课课程号编号：");
        int cid = sc.nextInt();

        System.out.println("请输入公开课日期：");
        String courseDate = sc.next();

        System.out.println("请输入技术专题：");
        String special = sc.next();

        System.out.println("请输入主讲人：");
        String speaker = sc.next();

        System.out.println("请输入组织者：");
        String organizer = sc.next();

        System.out.println("请输入地点：");
        String site = sc.next();

        System.out.println("请输入群体说明：");
        String groupShow = sc.next();

        System.out.println("请输入方式：");
        String way = sc.next();

        System.out.println("请输入学分：");
        int credit = sc.nextInt();

        System.out.println("请输入班级人数：");
        int num = sc.nextInt();

        System.out.println("请输入备注：");
        String remark = sc.next();

        OpenClassService openClassService = new OpenClassServiceImpl();
        OpenClass openClass = new OpenClass(cid,courseDate,special,speaker,organizer,site,groupShow,way,credit,num,remark);
        int flag = openClassService.addOpenClass(openClass);
        if(flag != 0){
            System.out.println("添加成功！");
        }else {
            System.out.println("添加失败！");
        }
    }
}