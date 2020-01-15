package com.youyoustudio.test;

import com.youyoustudio.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {


    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc.xml");

    @Test
    public void test(){
        //ApplicationContext 代表IOC容器
        System.out.println("容器完成初始化");
        Person person01 =(Person) applicationContext.getBean("person01");
        System.out.println(person01);
        Person person02 = applicationContext.getBean("person01",Person.class);
        System.out.println(person01 == person02);//为true，单例模式
    }

    /**
     * 使用有参构造方法来配置Bean
     */
    @Test
    public void testConstructors(){
        Person person02 = applicationContext.getBean("person02", Person.class);
        System.out.println(person02);
    }

    /**
     * 使用名称空间赋值
     */
    @Test
    public void testPNameSpace(){
        Person person03 = applicationContext.getBean("person03", Person.class);
        System.out.println(person03);
    }
}
