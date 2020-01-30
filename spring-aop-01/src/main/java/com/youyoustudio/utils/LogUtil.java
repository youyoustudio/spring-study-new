package com.youyoustudio.utils;


import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 如何将这个类（切面类）中的这些方法（通知方法）动态地在目标方法中运行的各个位置切入
 */
@Component
@Aspect
public class LogUtil {

    /**
     * 告诉spring每个方法都什么时候执行
     * try{
     *
     * @Before method.invoke(obj, args);
     * @AfterReturning }catch(Exception e){
     * @AfterThrowing }finally{
     * @After }
     * Spring有5个通知注解
     * @Before：在目标方法前运行 前置通知
     * @After：在目标方法结束后 后置通知
     * @AfterReturning：在目标方法正常返回之后 返回通知
     * @AfterThrowing：在目标方法抛出异常之后执行 异常通知
     * @Around：环绕 环绕通知
     */

    //执行目标方法之前 写入切入点表达式 execution(访问权限 返回值 方法签名)
    @Before("execution(public int com.youyoustudio.impl.MyCalculator.*(int,int))")
    public void logStart() {
        System.out.println("[XXXX]方法开始执行，用的参数列表是[XXXX]");
    }

    //目标方法正常执行完成之后执行
    @AfterReturning("execution(public int com.youyoustudio.impl.MyCalculator.*(int,int))")
    public void logReturn() {
        System.out.println("[XXXX]方法正常执行完成，计算结果是：");
    }

    //目标方法出现异常
    @AfterThrowing("execution(public int com.youyoustudio.impl.MyCalculator.*(int,int))")
    public void logException() {
        System.out.println("[XXXX]方法执行出现异常，异常信息：");
    }

    //目标方法最终结束之前
    @After("execution(public int com.youyoustudio.impl.MyCalculator.*(int,int))")
    public void logEnd() {
        System.out.println("[XXXX]方法最终结束了");
    }
}
