package com.ychs.uolab.openclass.service;
/*
 *  中北大学 版权所有 2020-2025
 */

import com.ychs.uolab.openclass.dao.OpenClassDao;
import com.ychs.uolab.openclass.dao.OpenClassDaoImpl;
import com.ychs.uolab.openclass.vo.OpenClass;

/**
 * @author 杨佳雨
 * @version 1.0
 */
public class OpenClassServiceImpl implements OpenClassService{

    private OpenClassDao openClassDao = new OpenClassDaoImpl();

    @Override
    public int selectOpenClass(String date, String dname, String grade, String major) {
        int  count = openClassDao.selectOpenClass(date,dname,grade,major);
        return count;
    }

    @Override
    public int addOpenClass(OpenClass openClass) {
        int count = openClassDao.insertOpenClass(openClass);
        return count;
    }
}
