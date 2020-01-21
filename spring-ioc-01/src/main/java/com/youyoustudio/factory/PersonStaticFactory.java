package com.youyoustudio.factory;

import com.youyoustudio.bean.Person;

/**
 * Person静态工厂
 */
public class PersonStaticFactory {

    public static Person getPerson(String name){
        System.out.println("静态工厂正在创建Person");
        Person person = new Person();
        person.setAge(10);
        person.setLastName(name);
        return person;
    }

}
