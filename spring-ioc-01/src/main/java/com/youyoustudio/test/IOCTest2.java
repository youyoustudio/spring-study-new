package com.youyoustudio.test;

import com.youyoustudio.bean.Car;
import com.youyoustudio.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

public class IOCTest2 {
    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc2.xml");

    /**
     * 正确赋值null
     * 默认引用类型，不赋值则为null
     *
     */
    @Test
    public void testNull(){
        Person personNull = applicationContext.getBean("personNull", Person.class);
        System.out.println(personNull);
    }

    /**
     * 使用bean标签赋值
     */
    @Test
    public void testPersonCar01(){
        Person personBean = applicationContext.getBean("personBean", Person.class);
        System.out.println(personBean);
    }

    /**
     * 使用ref引用已有对象
     * 严格的引用
     */
    @Test
    public void testPersonRef(){
        Person personRef = applicationContext.getBean("personRef", Person.class);
        System.out.println(personRef);
        Car car = personRef.getCar();
        Car carRef = applicationContext.getBean("car", Car.class);
        System.out.println(car == carRef);// true
        car.setCarName("宝马");
        System.out.println("修改了容器中的car");
        System.out.println(personRef.getCar());//也变更
    }

    /**
     * 正确赋值List属性
     */
    @Test
    public void testPersonList(){
        Person personList = applicationContext.getBean("personList", Person.class);
        System.out.println(personList);
        System.out.println(personList.getBookList().size());
    }

    /**
     * 正确赋值map属性
     */
    @Test
    public void testPersonMap(){
        Person personMap = applicationContext.getBean("personMap", Person.class);
        System.out.println(personMap);
    }

    /**
     * 正确为Properties赋值
     */
    @Test
    public void testProperties(){
        Person personProperties = applicationContext.getBean("personProperties", Person.class);
        System.out.println(personProperties);
        String property = personProperties.getProperties().getProperty("key01");
        System.out.println(property);
        Properties properties = new Properties();
    }

    /**
     * 测试util名称空间
     */
    @Test
    public void testUtilNamespace(){
        Person personUtil = applicationContext.getBean("personUtil", Person.class);
        System.out.println(personUtil);
        Object mapTest = applicationContext.getBean("mapTest");
        System.out.println(mapTest);
        System.out.println(mapTest.getClass());//class java.util.LinkedHashMap
    }

    /**
     * 测试级联属性
     */
    @Test
    public void testCascade(){
        Person personCascade = applicationContext.getBean("personCascade", Person.class);
        System.out.println(personCascade);
        Car car = applicationContext.getBean("car", Car.class);
        System.out.println(car.getPrice());
    }

    /**
     * 通过继承实现bean配置信息的重用
     */
    @Test
    public void testExtend(){
        Person personParent = applicationContext.getBean("personParent", Person.class);
        System.out.println(personParent);
        Person personChild = applicationContext.getBean("personChild", Person.class);
        System.out.println(personChild);
        System.out.println(personParent == personChild);
    }

    /**
     * 测试使用abstract创建bean模板
     */
    @Test
    public void testAbstract(){
        Person personParent01 = applicationContext.getBean("personParent01", Person.class);
        System.out.println(personParent01);
    }
}
