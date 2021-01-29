package com.ychs.uolab.labmember.POJO;
/*
 *  中北大学 版权所有 2020-2025
 */

/**
 * @author 杨佳雨
 * @version 1.0
 */
public class Member {
    private  int memberId;
    private int cno;
    private String stuName;
    private String stuId;
    private String sex;
    private String grade;
    private String nativePlace;
    private String telephone;
    private String email;
    private String campusPost;
    private String joiningDate;
    private String date;
    private String status;
    private String labJob;
    private String remark;
    private String dName;
    private String majorName;


    public Member() {
    }

    public Member(int memberId, int cno, String stuName, String stuId, String sex, String grade, String nativePlace, String telephone, String email, String campusPost, String joiningDate, String date, String status, String labJob, String remark, String dName, String majorName) {
        this.memberId = memberId;
        this.cno = cno;
        this.stuName = stuName;
        this.stuId = stuId;

        this.sex = sex;
        this.grade = grade;
        this.nativePlace = nativePlace;
        this.telephone = telephone;
        this.email = email;
        this.campusPost = campusPost;
        this.joiningDate = joiningDate;
        this.date = date;
        this.status = status;
        this.labJob = labJob;
        this.remark = remark;
        this.dName = dName;
        this.majorName = majorName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCampusPost() {
        return campusPost;
    }

    public void setCampusPost(String campusPost) {
        this.campusPost = campusPost;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLabJob() {
        return labJob;
    }

    public void setLabJob(String labJob) {
        this.labJob = labJob;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }
}
