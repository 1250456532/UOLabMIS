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
public class UpdateMemberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入要修改的实验室成员的信息的编号：");
        int memberId = scanner.nextInt();

        System.out.println("输入电话：");
        String telephone = scanner.next();
        System.out.println("输入校内职务：");
        String campusPost = scanner.next();
        System.out.println("输入状态：");
        String status = scanner.next();
        System.out.println("输入实验室职务：");
        String labJob = scanner.next();
        System.out.println("输入备注：");
        String remark = scanner.next();


        Member member = new Member();
        member.setTelephone(telephone);
        member.setCampusPost(campusPost);
        member.setStatus(status);
        member.setLabJob(labJob);
        member.setRemark(remark);
        member.setMemberId(memberId);

        LabMemberService labMemberService  = new LabMemberServiceImpl();
        int count = labMemberService.updateMember(member);
        if(count != 0) {
            System.out.println("修改成功！");
        } else {
            System.out.println("修改失败！");
        }
    }
}
