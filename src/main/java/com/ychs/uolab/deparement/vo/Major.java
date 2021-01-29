package com.ychs.uolab.deparement.vo;
/*
 *  中北大学 版权所有 2020-2025
 */

/**
 * @author 杨佳雨
 * @version 1.0
 */
public class Major {
    private int majorId;
    private String majorName;
    private int did;
    private String remark;

    public Major() {
    }

    public Major(int majorId, String majorName, int did, String remark) {
        this.majorId = majorId;
        this.majorName = majorName;
        this.did = did;
        this.remark = remark;
    }

    public int getMajorId() {
        return majorId;
    }

    public void setMajorId(int majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Major{" +
                "majorId=" + majorId +
                ", majorName='" + majorName + '\'' +
                ", did=" + did +
                ", remark='" + remark + '\'' +
                '}';
    }
}
