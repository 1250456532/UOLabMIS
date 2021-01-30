package com.ychs.uolab.competiton.service;
/*
 *  中北大学 版权所有 2020-2025
 */

import com.ychs.uolab.competiton.dao.CompetitionDao;
import com.ychs.uolab.competiton.dao.CompetitionDaoImpl;
import com.ychs.uolab.competiton.vo.Competition;

/**
 * @author 杨佳雨
 * @version 1.0
 */
public class CompetitionServiceImpl implements CompetitionService{
    CompetitionDao competitionDao = new CompetitionDaoImpl();
    @Override
    public int updateCompetition(Competition competition) {
        int count = competitionDao.updateInformation(competition);
        return count;
    }

    @Override
    public int addCompetition(Competition competition) {
        int count = competitionDao.addInformation(competition);
        return  count;
    }
}
