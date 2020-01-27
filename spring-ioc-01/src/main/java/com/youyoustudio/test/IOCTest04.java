package com.youyoustudio.test;

import com.youyoustudio.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest04 {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc4.xml");

    /**
     * 多实例
     */
    @Test
    public void testPrototype(){
        System.out.println("容器启动完成！");
        Person personPrototype01 = applicationContext.getBean("personPrototype", Person.class);
        Person personPrototype02 = applicationContext.getBean("personPrototype", Person.class);
        System.out.println(personPrototype01 == personPrototype02);
    }

    /**
     * 静态工厂方法
     */
    @Test
    public void testStaticFactory(){
        System.out.println("容器启动完成！");
        Person person = applicationContext.getBean("personStaticFactory",Person.class);
        Person person02 = applicationContext.getBean("personStaticFactory", Person.class);
        System.out.println(person == person02);
    }

    /**
     * 实例工厂方法
     */
    @Test
    public void testInstanceFactory(){
        System.out.println("容器启动完成！");
        Person person = applicationContext.getBean("personInstanceFactory",Person.class);
        Person person02 = applicationContext.getBean("personInstanceFactory", Person.class);
        System.out.println(person == person02);
    }

    @Test
    public void testFactoryBean(){
        System.out.println("容器启动完成");
        Object bookFacoryBean = applicationContext.getBean("bookFacoryBean");
        System.out.println(bookFacoryBean);
        Object bookFactoryBean2 = applicationContext.getBean("bookFacoryBean");
        System.out.println(bookFacoryBean == bookFactoryBean2);

    }

}
