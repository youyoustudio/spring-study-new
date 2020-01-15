package com.youyoustudio.test;

import com.youyoustudio.bean.Car;
import com.youyoustudio.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
}
