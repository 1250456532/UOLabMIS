package com.ychs.uolab.labmember.test;
/*
 *  中北大学 版权所有 2020-2025
 */

import com.ychs.uolab.labmember.service.LabMemberService;
import com.ychs.uolab.labmember.service.LabMemberServiceImpl;
import com.ychs.uolab.labmember.vo.Member;

import java.util.Scanner;

/**
 * @Author 杨佳雨
 * @Version 1.0
 */
public class AddMemberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入实验室成员编号：");
        int memberId = sc.nextInt();

        System.out.println("请输入班级编号：");
        int cno = sc.nextInt();

        System.out.println("请输入学生姓名：");
        String stuName = sc.next();

        System.out.println("输入学生学号");
        String stuId = sc.next();

        System.out.println("请输入性别：");
        String sex =sc.next();

        System.out.println("请输入年级：");
        String grade = sc.next();

        System.out.println("请输入籍贯：");
        String nativePlace = sc.next();

        System.out.println("输入电话号码");
        String telephone = sc.next();

        System.out.println("请输入电子邮箱：");
        String email = sc.next();

        System.out.println("请输入校内职务：");
        String campusPost = sc.next();

        System.out.println("请输入学生加入实验室的时间：");
        String joiningDate =sc.next();

        System.out.println("请输入状态：");
        String status = sc.next();

        System.out.println("请输入实验室职务：");
        String labJob = sc.next();

        System.out.println("请输入备注：");
        String remark = sc.next();
        LabMemberService labMemberService = new LabMemberServiceImpl();
        Member member = new Member(memberId,cno,stuName,stuId,sex,grade,nativePlace,telephone,email,campusPost,joiningDate,status,labJob,remark);
        int flag = labMemberService.addMember(member);
        if(flag == 0){
            System.out.println("添加失败！");
        }else {
            System.out.println("添加成功！");
        }



    }
}
