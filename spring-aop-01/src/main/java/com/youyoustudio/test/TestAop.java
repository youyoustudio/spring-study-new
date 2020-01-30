package com.youyoustudio.test;

import com.youyoustudio.impl.MyCalculator;
import com.youyoustudio.inter.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void testAop() {
        //获取类型时，一定要用接口，不要使用实现类的类型
        Calculator calculator = applicationContext.getBean(Calculator.class);
        int result = calculator.add(1, 2);
        System.out.println(result);
    }

}
