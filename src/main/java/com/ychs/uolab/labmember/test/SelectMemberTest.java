package com.ychs.uolab.labmember.test;
/*
 *  中北大学 版权所有 2020-2025
 */

import com.ychs.uolab.labmember.service.LabMemberService;
import com.ychs.uolab.labmember.service.LabMemberServiceImpl;
import com.ychs.uolab.labmember.vo.Member;

import java.util.List;

/**
 * @author 杨佳雨
 * @version 1.0
 */
public class SelectMemberTest {
    public static void main(String[] args) {
        LabMemberService memberService = new LabMemberServiceImpl();
        String stu_name = null;
        String grade = null;
        String telephone = null;
        String dname = null;
        String major_name = null;
        String status = null;
        String lab_job = null;
        List<Member> memberList = memberService.findMembers(stu_name, grade, telephone, dname, major_name, status, lab_job);
        for (int i = 0; i < memberList.size(); i++) {
            Member member  = memberList.get(i);
            System.out.println(member);
        }
    }
}
