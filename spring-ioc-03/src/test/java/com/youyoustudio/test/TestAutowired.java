package com.youyoustudio.test;

import com.youyoustudio.controller.PersonController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowired {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext1.xml");

    @Test
    public void testAutowired() {
        PersonController personController = applicationContext.getBean(PersonController.class);
        personController.doGet();
    }

    @Test
    public void testAutowiredMethod() {

    }
}
