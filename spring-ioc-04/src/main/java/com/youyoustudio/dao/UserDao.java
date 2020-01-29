package com.youyoustudio.dao;

import com.youyoustudio.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends BaseDao<User> {

    @Override
    public void saveDb() {
        System.out.println("保存用户信息");
    }
}
