package com.youyoustudio.test;


import com.youyoustudio.impl.MyCalculator;
import com.youyoustudio.inter.Calculator;
import com.youyoustudio.proxy.CalculatoryProxy;
import org.junit.Test;

public class TestProxy {

    @Test
    public void test() {
        Calculator calculator = new MyCalculator();
        Calculator proxy = CalculatoryProxy.getProxy(calculator);
        int result = proxy.add(1, 2);
        System.out.println(result);
    }

}
