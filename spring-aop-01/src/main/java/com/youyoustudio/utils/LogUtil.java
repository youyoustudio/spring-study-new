package com.youyoustudio.utils;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

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
    public void logStart(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();//获取到方法签名
        System.out.println("[" + signature.getName() + "]方法开始执行，用的参数列表是[" + Arrays.asList(args) + "]");
    }

    //目标方法正常执行完成之后执行
    @AfterReturning(value = "execution(public int com.youyoustudio.impl.MyCalculator.*(int,int))",
            returning = "result")
    public void logReturn(JoinPoint joinPoint, Object result) {
        System.out.println("[" + joinPoint.getSignature().getName() + "]方法正常执行完成，计算结果是：" + result);
    }

    //目标方法出现异常
    @AfterThrowing(value = "execution(public int com.youyoustudio.impl.MyCalculator.*(int,int))",
            throwing = "exception")
    public void logException(JoinPoint joinPoint, Exception exception) {
        System.out.println("[" + joinPoint.getSignature().getName() + "]方法执行出现异常，异常信息：" + exception);
        exception.printStackTrace();
    }

    //目标方法最终结束之前
    @After("execution(public int com.youyoustudio.impl.MyCalculator.*(int,int))")
    public void logEnd() {
        System.out.println("[XXXX]方法最终结束了");
    }


    /**
     * @Around 环绕通知方法，就是前4个方法合一
     */
    @Around("execution(public int com.youyoustudio.impl.MyCalculator.*(int,int))")
    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        try {
            //相当于method.invoke(obj,args);
            Object result = proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
            return result;//将返回值返回回去
        } catch (Throwable e) {
            e.printStackTrace();
            throw e;//为了让外界知道异常，此处需要将异常抛出，否则，异常将被吃掉
        }
    }
}
