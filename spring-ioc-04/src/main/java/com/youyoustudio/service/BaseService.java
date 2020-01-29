package com.youyoustudio.service;

import com.youyoustudio.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {

    @Autowired
    private BaseDao<T> baseDao;

    public void saveDb() {
        baseDao.saveDb();
    }
}
