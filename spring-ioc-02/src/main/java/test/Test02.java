package test;

import bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");

    /**
     * 测试基于xml的自动装配
     */
    @Test
    public void testAutoByXML() {
        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);
    }

    /**
     * SpEL
     * spring 表达式语言
     */
    @Test
    public void testSpEL() {
        Person person01 = applicationContext.getBean("person01", Person.class);
        System.out.println(person01);
    }
}
