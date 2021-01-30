package com.ychs.uolab.competiton.dao;
/*
 *  中北大学 版权所有 2020-2025
 */

import com.ychs.uolab.competiton.vo.Competition;

/**
 * @author 杨佳雨
 * @version 1.0
 */
public interface CompetitionDao {
    /**
     * 按年度查询参赛信息
     * @param date 日期
     * @return 成功1 失败0
     */
    public int selectInformation(String date);
    /**
     * 参赛信息修改
     * @param competition 比赛对象
     * @return 成功1 失败0
     */
    public int updateInformation(Competition competition);
    /**
     * 参赛信息录入
     * @param competition 比赛对象
     * @return 成功1 失败0
     */
    public int addInformation(Competition competition);


}
