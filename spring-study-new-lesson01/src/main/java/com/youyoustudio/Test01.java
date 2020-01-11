package com.youyoustudio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    private ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc01.xml");

    @Test
    public void test01(){
        Student student = (Student)ioc.getBean("student");
        System.out.println(student);

    }


}
