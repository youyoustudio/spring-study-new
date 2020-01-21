package com.youyoustudio.factory;

import com.youyoustudio.bean.Person;

/**
 * Person实例工厂
 */
public class PersonInstanceFactory {

    public Person getPerson(String name){
        System.out.println("实例工厂正在创建Person");
        Person person = new Person();
        person.setAge(10);
        person.setLastName(name);
        return person;
    }
}
