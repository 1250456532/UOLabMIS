package com.ychs.uolab.deparement.dao;
/*
 *  中北大学 版权所有 2020-2025
 */


import com.ychs.uolab.deparement.vo.Dept;
import com.ychs.uolab.deparement.vo.Major;

/**
 * 院系管理DAO
 * @author 杨佳雨
 * @version 1.0
 *
 */
public interface DeptDao {
    /**
     * 添加专业
     * @param major 专业对象
     * @return 成功返回1，失败返回0
     */
    public  int insertMajor(Major major);

    /**
     * 添加院系
     * @param dept 院系对象
     * @return 添加成功返回1，否则返回0
     */
    public  int insertDept(Dept dept);
}
