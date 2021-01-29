package com.ychs.uolab.deparement.service;
/*
 *  中北大学 版权所有 2020-2025
 */


import com.ychs.uolab.deparement.vo.Dept;
import com.ychs.uolab.deparement.vo.Major;

/**
 * 院系业务接口
 * @author 杨佳雨
 * @version 1.0
 *
 */
public interface DeptService {
    /**
     * 添加专业
     * @param major 专业对象
     * @return 成功返回1 ，失败返回0
     */
    public  int addMajor(Major major);

    /**
     * 添加院系业务方法
     * @param dept 业务对象
     * @return 添加成功返回1，失败返回0
     */
    public int addDept(Dept dept);
}
