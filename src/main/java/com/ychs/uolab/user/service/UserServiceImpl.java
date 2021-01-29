package com.ychs.uolab.user.service;
/*
 *  中北大学 版权所有 2020-2025
 */

import com.ychs.uolab.user.dao.UserDao;
import com.ychs.uolab.user.dao.UserDaoImpl;
import com.ychs.uolab.user.vo.User;

import java.util.List;

/**
 * @author 杨佳雨
 * @version 1.0
 */
public class UserServiceImpl implements UserService {
    /**
     * UserDao对象，在UserServiceImpl中使用它
     */
    private UserDao userDao = new UserDaoImpl();

    @Override
    public boolean checkUser(String userName, String userPsw) {
        // 调用UserDao中的方法login
        boolean flag = userDao.login(userName, userPsw);
        return flag;
    }

    @Override
    public boolean addUser(User user) {
        // 调用UserDao中的方法insertUser
        boolean flag = userDao.insertUser(user);
        return flag;
    }

    @Override
    public int deleteUser(String userid) {
        int count = userDao.deleteUser(userid);
        return count;
    }

    @Override
    public int modifyUser(User user) {
        int count = userDao.updateUser(user);
        return count;
    }

    @Override
    public List<User> findUser(String uname, String dname, String major, String classes, String grade) {
        List<User> ulist = userDao.selectUser(uname, dname, major, classes, grade);
        return ulist;
    }

}