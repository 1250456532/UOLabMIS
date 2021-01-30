package com.ychs.uolab.credit.test;
/*
 *  中北大学 版权所有 2020-2025
 */

import com.ychs.uolab.credit.service.CreditService;
import com.ychs.uolab.credit.service.CreditServiceImpl;
import com.ychs.uolab.credit.vo.Credit;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author 杨佳雨
 * @version 1.0
 */
public class CreditEntryTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学分编号：");
        int creditId = sc.nextInt();

        System.out.println("请输入成员编号：");
        int memberId = sc.nextInt();

        System.out.println("请输入学号：");
        String stuId = sc.next();

        System.out.println("请输入姓名：");
        String sName = sc.next();

        System.out.println("请输入年级：");
        String grade = sc.next();

        System.out.println("请输入院系：");
        String dept = sc.next();

        System.out.println("请输入创新学分分值：");
        int creditPoints = sc.nextInt();

        System.out.println("请输入事由：");
        String subject = sc.next();

        System.out.println("请输入取得时间：");
        String getDate = sc.next();

        System.out.println("请输入录入人：");
        String entryPerson = sc.next();

        System.out.println("录入时间：");
        DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String entryDate = f.format(date);
        System.out.println(entryDate);


        System.out.println("请输入备注：");
        String remark = sc.next();

        CreditService creditService = new CreditServiceImpl();
        Credit credit = new Credit(creditId,memberId,stuId,sName,grade,dept,creditPoints,subject,getDate,entryPerson,entryDate,remark);
        int count = creditService.creditEntry(credit);
        if(count!=0){
            System.out.println("录入成功！");
        }else {
            System.out.println("录入失败！");
        }
    }
}
