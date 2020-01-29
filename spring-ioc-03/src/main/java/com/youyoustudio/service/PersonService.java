package com.youyoustudio.service;

import com.youyoustudio.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public void saveDb() {
        personDao.saveDb();
    }
}
