package com.youyoustudio.factory;

import com.youyoustudio.bean.Person;
import org.springframework.beans.factory.FactoryBean;

public class PersonFactoryBeanImpl implements FactoryBean<Person> {
    public Person getObject() throws Exception {
        System.out.println("使用Factory Bean 创建Person对象");
        Person person = new Person();
        person.setLastName("王五");
        person.setAge(20);
        return person;
    }

    public Class<?> getObjectType() {
        return Person.class;
    }

}
