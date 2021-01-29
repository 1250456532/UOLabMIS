package com.ychs.uolab.labmember.service;
/*
 *  中北大学 版权所有 2020-2025
 */

import com.ychs.uolab.labmember.vo.Member;

import java.io.File;
import java.util.List;

/**
 * @author 杨佳雨
 * @version 1.0
 */
public interface LabMemberService {
    /**
     * 成员统计并导出
     *
     * @param dName     院系名称
     * @param grade     年级
     * @param majorName 专业名称
     * @param status    状态
     * @param type    种数
     * @return 成功返回1 失败-
     */
    public File statisticsMember(String dName, String grade, String majorName, String status, int type);

    /**
     * 查询成员
     *
     * @param stuName   姓名
     * @param grade     年级
     * @param telephone 电话
     * @param dName     院系名称
     * @param majorName 专业名称
     * @param status    状态
     * @param labJob    职务
     * @return 成功1 失败0
     */
    public List<Member> findMembers(String stuName, String grade, String telephone, String dName, String majorName,
                                    String status, String labJob);

    /**
     * 修改成员
     *
     * @param member 成员对象
     * @return 成功1，失败0
     */
    public int updateMember(Member member);

    /**
     * 添加成员
     *@param member 成员对象
     * @return 成功1，失败0
     */
    public int addMember(Member member);

}
