package com.youyoustudio.proxy;

import com.youyoustudio.inter.Calculator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class CalculatoryProxy {

    /**
     * @param calculator 被代理对象 宝强
     * @return 代理对象 宋喆
     */
    public static Calculator getProxy(final Calculator calculator) {
        ClassLoader classLoader = calculator.getClass().getClassLoader();
        Class<?>[] interfaces = calculator.getClass().getInterfaces();
        InvocationHandler invocationHandler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("方法【" + method.getName() + "】开始执行：参数：【" + Arrays.asList(args) + "】");
                Object result = method.invoke(calculator, args);
                System.out.println("方法【" + method.getName() + "】执行完毕：结果：【" + result + "】");

                return result;
            }
        };
        Object o = Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        return (Calculator) o;
    }
}
