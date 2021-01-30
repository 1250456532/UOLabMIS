package com.ychs.uolab.competiton.test;
/*
 *  中北大学 版权所有 2020-2025
 */

import com.ychs.uolab.competiton.service.CompetitionService;
import com.ychs.uolab.competiton.service.CompetitionServiceImpl;
import com.ychs.uolab.competiton.vo.Competition;

import java.util.Scanner;

/**
 * @author 杨佳雨
 * @version 1.0
 */
public class UpdateInformationTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入比赛编号：");
        int cId = sc.nextInt();
        System.out.println("请输入修改的组员信息：");
        String groupMember = sc.next();
        System.out.println("请输入修改的等级：");
        String award = sc.next();

        Competition competition = new Competition();
        competition.setGroupMember(groupMember);
        competition.setAward(award);
        competition.setcId(cId);
        CompetitionService competitionService = new CompetitionServiceImpl();
        int count = competitionService.updateCompetition(competition);
        System.out.println(count);
        if (count != 0) {
            System.out.println("修改成功！");
        } else {
            System.out.println("修改失败！");
        }
    }
}
