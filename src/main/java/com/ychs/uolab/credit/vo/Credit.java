package com.ychs.uolab.credit.vo;
/*
 *  中北大学 版权所有 2020-2025
 */

/**
 * @author 杨佳雨
 * @version 1.0
 */
public class Credit {
    public int creditId;
    public int memberId;
    public String stuId;
    public String sName;
    public String grade;
    public String dept;
    public int creditPoints;
    public String subject;
    public String getDate;
    public String entryPerson;
    public String entryDate;
    public String remark;

    public Credit() {

    }

    public Credit(int creditId, int memberId, String stuId, String sName, String grade, String dept, int creditPoints, String subject, String getDate, String entryPerson, String entryDate, String remark) {
        this.creditId = creditId;
        this.memberId = memberId;
        this.stuId = stuId;
        this.sName = sName;
        this.grade = grade;
        this.dept = dept;
        this.creditPoints = creditPoints;
        this.subject = subject;
        this.getDate = getDate;
        this.entryPerson = entryPerson;
        this.entryDate = entryDate;
        this.remark = remark;
    }

    public int getCreditId() {
        return creditId;
    }

    public void setCreditId(int creditId) {
        this.creditId = creditId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getCreditPoints() {
        return creditPoints;
    }

    public void setCreditPoints(int creditPoints) {
        this.creditPoints = creditPoints;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGetDate() {
        return getDate;
    }

    public void setGetDate(String getDate) {
        this.getDate = getDate;
    }

    public String getEntryPerson() {
        return entryPerson;
    }

    public void setEntryPerson(String entryPerson) {
        this.entryPerson = entryPerson;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
