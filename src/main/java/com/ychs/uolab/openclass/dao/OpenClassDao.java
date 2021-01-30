package com.ychs.uolab.openclass.dao;
/*
 *  中北大学 版权所有 2020-2025
 */

import com.ychs.uolab.openclass.vo.OpenClass;

/**
 * @author 杨佳雨
 * @version 1.0
 */
public interface OpenClassDao {

    /**
     * 查询公开课信息
     * @param date 日期
     * @param dname 院系名称
     * @param grade 年级
     * @param major 专业
     * @return 成功1 失败0
     */
    public int selectOpenClass(String date, String dname, String grade, String major);

    /**
     * 录入公开课信息
     * @param openClass 公开课
     * @return 成功1 失败0
     */
    public int insertOpenClass(OpenClass openClass);
}
