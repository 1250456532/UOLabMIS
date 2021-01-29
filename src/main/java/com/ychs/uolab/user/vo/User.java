package com.ychs.uolab.user.vo;
/*
 *  中北大学 版权所有 2020-2025
 */

/**
 * @author 杨佳雨
 * @version 1.0
 */
public class User {
    private int uid;
    private String username;
    private String password;
    private String realname;
    private String sex;
    private String telephone;
    private String dname;
    private String majorName;
    private String cname;
    private String grade;
    private String duty;
    private String qq;
    private String status;
    private String remark;

    public User() {
    }


    public User(int uid, String username, String password, String realname, String sex, String telephone, String dname, String majorName, String cname, String grade, String duty, String qq, String status, String remark) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.realname = realname;
        this.sex = sex;
        this.telephone = telephone;
        this.dname = dname;
        this.majorName = majorName;
        this.cname = cname;
        this.grade = grade;
        this.duty = duty;
        this.qq = qq;
        this.status = status;
        this.remark = remark;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
