package com.ychs.uolab.credit.service;
/*
 *  中北大学 版权所有 2020-2025
 */

import com.ychs.uolab.credit.dao.CreditDao;
import com.ychs.uolab.credit.dao.CreditDaoImpl;
import com.ychs.uolab.credit.vo.Credit;

/**
 * @author 杨佳雨
 * @version 1.0
 */
public class CreditServiceImpl implements CreditService {
    CreditDao creditDao = new CreditDaoImpl();
    @Override
    public int selectCredit(Credit credit) {
        return 0;
    }

    @Override
    public int creditEntry(Credit credit) {
        int count = creditDao.creditEntry(credit);
        return count;
    }
}
