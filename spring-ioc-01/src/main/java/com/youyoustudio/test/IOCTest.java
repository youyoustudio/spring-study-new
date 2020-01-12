package com.youyoustudio.test;

import com.youyoustudio.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {

    @Test
    public void test(){
        //ApplicationContext 代表IOC容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc.xml");
        Person person01 =(Person) applicationContext.getBean("person01");
        System.out.println(person01);
    }
}
