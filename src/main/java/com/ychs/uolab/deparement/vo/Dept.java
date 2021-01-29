package com.ychs.uolab.deparement.vo;
/*
 *  中北大学 版权所有 2020-2025
 */

/**
 * 院系
 * @author 杨佳雨
 * @version 1.0
 */
public class Dept {
    private  int did;
    private  String dname;
    private String ramark;

    public Dept() {
        super();
    }

    public Dept(int did, String dname, String ramark) {
        this.did = did;
        this.dname = dname;
        this.ramark = ramark;
    }

    public Dept(String dname, String ramark) {
        this.dname = dname;
        this.ramark = ramark;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getRamark() {
        return ramark;
    }

    public void setRamark(String ramark) {
        this.ramark = ramark;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", ramark='" + ramark + '\'' +
                '}';
    }
}
