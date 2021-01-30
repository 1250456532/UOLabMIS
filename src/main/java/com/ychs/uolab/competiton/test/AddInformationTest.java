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
public class AddInformationTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入竞赛编号：");
        int cId = sc.nextInt();

        System.out.println("请输入竞赛类别：");
        String categories = sc.next();

        System.out.println("请输入年度：");
        String year = sc.next();

        System.out.println("请输入题目：");
        String topic = sc.next();

        System.out.println("请输入组长：");
        String groupLeader = sc.next();

        System.out.println("请输入组员：");
        String groupMember = sc.next();

        System.out.println("请输入获奖等级：");
        String award = sc.next();

        System.out.println("请输入指导老师：");
        String adviser = sc.next();

        System.out.println("请输入备注：");
        String remark = sc.next();
        CompetitionService competitionService = new CompetitionServiceImpl();
        Competition competition = new Competition(cId,categories,year,topic,groupLeader,groupMember,award,adviser,remark);
        int count = competitionService.addCompetition(competition);
        if(count!=0){
            System.out.println("添加成功！");
        }else{
            System.out.println("添加失败！");
        }


    }
}
