package com.ychs.uolab.labmember.service;
/*
 *  中北大学 版权所有 2020-2025
 */

import com.ychs.uolab.labmember.dao.LabmemberDao;
import com.ychs.uolab.labmember.dao.LabmemberDaoImpl;
import com.ychs.uolab.labmember.vo.Member;

import java.io.File;
import java.util.List;

/**
 * @author 杨佳雨
 * @version 1.0
 */
public class LabMemberServiceImpl implements LabMemberService {
    private LabmemberDao labmemberDao = new LabmemberDaoImpl();
    @Override
    public File statisticsMember(String dName, String grade, String majorName, String status, int type) {
        return null;
    }

    @Override
    public List<Member> findMembers(String stuName, String grade, String telephone, String dName, String majorName, String status, String labJob) {
        return null;
    }

    @Override
    public int updateMember(Member member) {
        int count = labmemberDao.updateMember(member);
        return count;
    }

    @Override
    public int addMember(Member member) {

        int count = labmemberDao.insertMember(member);
        return count;
    }
}
