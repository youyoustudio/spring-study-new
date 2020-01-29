package com.youyoustudio.dao;

import com.youyoustudio.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao extends BaseDao<Student> {

    @Override
    public void saveDb() {
        System.out.println("保存Student信息");
    }
}
