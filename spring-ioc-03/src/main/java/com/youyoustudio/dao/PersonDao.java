package com.youyoustudio.dao;

import org.springframework.stereotype.Repository;

@Repository
public class PersonDao {

    public void saveDb() {
        System.out.println("保存成功！");
    }
}
