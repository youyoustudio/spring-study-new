package com.youyoustudio.test;


import com.youyoustudio.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = "classpath:applicationContext1.xml")
@RunWith(SpringJUnit4ClassRunner.class)//默认使用的是junit的单元测试驱动。此处注解则使用Spring的单元测试
public class TestSpringTest {

    @Autowired
    private PersonService personService;

    @Test
    public void test() {
        System.out.println(personService);
        personService.saveDb();
    }
}
