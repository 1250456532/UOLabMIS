package com.ychs.uolab.deparement.service;
/*
 *  中北大学 版权所有 2020-2025
 */

import com.ychs.uolab.deparement.dao.DeptDao;
import com.ychs.uolab.deparement.dao.DeptDaoImpl;
import com.ychs.uolab.deparement.vo.Dept;
import com.ychs.uolab.deparement.vo.Major;


/**
 * 院系业务接口实现类
 * @author 杨佳雨
 * @version 1.0
 *
 */
public class DeptServiceImpl implements  DeptService {

    private DeptDao deptDao = new DeptDaoImpl();

    @Override
    public int addMajor(Major major) {
        int flag = deptDao.insertMajor(major);
        return flag;
    }

    @Override
    public int addDept(Dept dept) {
        int flag = deptDao.insertDept(dept);
        return flag;
    }
}
