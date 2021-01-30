package com.ychs.uolab.credit.dao;
/*
 *  中北大学 版权所有 2020-2025
 */

import com.ychs.uolab.credit.vo.Credit;

/**
 * @author 杨佳雨
 * @version 1.0
 */
public interface CreditDao {
    /**
     * 学分统计
     * @param credit 学分对象
     * @return 成功1 失败0
     */
    public int creditStatistics(Credit credit);
    /**
     * 查询学分
     * @param credit 学分
     * @return 成功1 失败0
     */
    public int selectCredit(Credit credit);
    /**
     * 学分录入
     * @param credit 学分对象
     * @return 成功1 失败0
     */
    public int creditEntry(Credit credit);
}
