package com.ychs.uolab.deparement.test;
/*
 *  中北大学 版权所有 2020-2025
 */


import com.ychs.uolab.deparement.service.DeptService;
import com.ychs.uolab.deparement.service.DeptServiceImpl;
import com.ychs.uolab.deparement.vo.Major;

import java.util.Scanner;

/**
 * @author 杨佳雨
 * @version 1.0
 */
public class AddMajorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入院系编号：");
        int did = sc.nextInt();
        System.out.println("请输入专业名称：");
        String  majorName = sc.next();
        System.out.println("请输入备注：");
        String remark = sc.next();
        int majorId =(int) (Math.random()*10000);
        Major major = new Major(majorId,majorName,did,remark);

        DeptService deptService = new DeptServiceImpl();

        int flag = deptService.addMajor(major);
        System.out.println(flag);
        if(flag == 1){
            System.out.println("添加成功！");
        }else{
            System.out.println("添加失败！");
        }
    }
}
