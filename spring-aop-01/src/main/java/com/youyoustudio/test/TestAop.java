package com.youyoustudio.test;

import com.youyoustudio.impl.MyCalculator;
import com.youyoustudio.impl.MyCalculator01;
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
        int result = calculator.div(1, 0);
        System.out.println(result);
        System.out.println(calculator);
        System.out.println(calculator.getClass());
    }

    /**
     * AOP无接口模式
     */
    @Test
    public void testNoInterface() {
        MyCalculator01 myCalculator01 = applicationContext.getBean(MyCalculator01.class);
        int result = myCalculator01.add(1, 2);
        System.out.println(result);
        System.out.println(myCalculator01);
        //class com.youyoustudio.impl.MyCalculator01$$EnhancerBySpringCGLIB$$ae1a1e9d CGLIB创建了内部代理对象
        System.out.println(myCalculator01.getClass());
    }

}
