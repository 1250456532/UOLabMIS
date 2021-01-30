package com.ychs.uolab.competiton.service;
/*
 *  中北大学 版权所有 2020-2025
 */

import com.ychs.uolab.competiton.vo.Competition;

/**
 * @author 杨佳雨
 * @version 1.0
 */
public interface CompetitionService {
    /**
     * 修改比赛信息
     * @param competition 比赛对象
     * @return 成功1 失败0
     */
    public int updateCompetition(Competition competition);
    /**
     * 添加比赛信息
     * @param competition 比赛对象
     * @return 成功1 失败0
     */
    public int addCompetition(Competition competition);
}
