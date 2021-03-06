package com.ychs.uolab.labmember.vo;
/*
 *  中北大学 版权所有 2020-2025
 */


import com.ychs.uolab.deparement.vo.Dept;
import com.ychs.uolab.deparement.vo.Major;

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
    private String status;
    private String labJob;
    private String remark;

    public Member() {
        super();
    }

    public Member(int memberId, int cno, String stuName, String stuId, String sex, String grade, String nativePlace, String telephone, String email, String campusPost, String joiningDate, String status, String labJob, String remark) {
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
        this.status = status;
        this.labJob = labJob;
        this.remark = remark;
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

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", cno=" + cno +
                ", stuName='" + stuName + '\'' +
                ", stuId='" + stuId + '\'' +
                ", sex='" + sex + '\'' +
                ", grade='" + grade + '\'' +
                ", nativePlace='" + nativePlace + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", campusPost='" + campusPost + '\'' +
                ", joiningDate='" + joiningDate + '\'' +

                ", status='" + status + '\'' +
                ", labJob='" + labJob + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public void setMajor(Major major) {
        // TODO Auto-generated method stub

    }

    public void setDept(Dept dept) {
        // TODO Auto-generated method stub

    }
}
