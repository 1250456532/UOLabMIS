package com.ychs.uolab.competiton.vo;
/*
 *  中北大学 版权所有 2020-2025
 */

/**
 * @author 杨佳雨
 * @version 1.0
 */
public class Competition {
    private int cId;
    private String categories;
    private String year;
    private String topic;
    private String groupLeader;
    private String groupMember;
    private String award;
    private String adviser;
    private String remark;

    public Competition() {
    }

    public Competition(int cId, String categories, String year, String topic, String groupLeader, String groupMember, String award, String adviser, String remark) {
        this.cId = cId;
        this.categories = categories;
        this.year = year;
        this.topic = topic;
        this.groupLeader = groupLeader;
        this.groupMember = groupMember;
        this.award = award;
        this.adviser = adviser;
        this.remark = remark;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getGroupLeader() {
        return groupLeader;
    }

    public void setGroupLeader(String groupLeader) {
        this.groupLeader = groupLeader;
    }

    public String getGroupMember() {
        return groupMember;
    }

    public void setGroupMember(String groupMember) {
        this.groupMember = groupMember;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public String getAdviser() {
        return adviser;
    }

    public void setAdviser(String adviser) {
        this.adviser = adviser;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
