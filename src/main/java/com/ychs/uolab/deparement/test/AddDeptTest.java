package com.ychs.uolab.deparement.test;
/*
 *  中北大学 版权所有 2020-2025
 */


import com.ychs.uolab.deparement.service.DeptService;
import com.ychs.uolab.deparement.service.DeptServiceImpl;
import com.ychs.uolab.deparement.vo.Dept;

import java.util.Scanner;

/**
 * 添加院系测试类
 *
 * @author 杨佳雨
 * @version 1.0
 */
public class AddDeptTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入新增的院系编号：");
        int did = sc.nextInt();
        System.out.println("请输入新增院系名称：");
        String dname = sc.next();
        System.out.println("请输入备注：");
        String remark = sc.next();

        DeptService deptService = new DeptServiceImpl();
        Dept dept = new Dept(did,dname,remark);
        int flag = deptService.addDept(dept);
        if(flag == 0){
            System.out.println("添加失败！");
        }else {
            System.out.println("添加成功！");
        }
    }
}
