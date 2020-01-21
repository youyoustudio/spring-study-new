package com.youyoustudio.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest03 {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc3.xml");

    /**
     * 测试bean创建顺序
     * bean默认按照xml定义的顺序进行创建
     */
    @Test
    public void testBeanCreateOrder(){

    }
}
