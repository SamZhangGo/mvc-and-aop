package com.ruijie.clouddesk.web.share.framework.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * <p>Title: ExecutionAspect</p>
 * <p>Description: Function Description</p>
 * <p>Copyright: Ruijie Co., Ltd. (c) 2018</p>
 * <p>@Author: zhangsiming</p>
 * <p>@Date: 2018/5/22 0:28</p>
 *
 * 匹配Execution表达式的切面类
 */
@Aspect
@Component
public class ExecutionAspect {

    /**
     * execution(* com.sample.service.impl..*.*(..))
     * 第一个*表示返回类型
     * 第一个..表示当前包或者当前子包
     * 第二个*号：表示类名，*号表示所有的类。
     * *(..):最后这个星号表示方法名，*号表示所有的方法，后面括弧里面表示方法的参数，两个句点表示任何参数。
     */
    @Pointcut("execution(public int com.ruijie.clouddesk.web.share.framework.aop..*TargetServiceImpl.executionMethod(..))")
    public void executionMethod() {

    }

    @Before("executionMethod()")
    public void beforeExecutionMethod() {
        println("before invoke execution method");
    }

    @After("executionMethod()")
    public void afterExecutionMethod() {

        println("after execution method invoked");
    }

    @Around("executionMethod()")
    public Object aroundExecutionMethod(ProceedingJoinPoint proceedingJoinPoint) {
        println("around execution method start");
        Object[] args = proceedingJoinPoint.getArgs();
        handleArgs(args);
        try{
            Object ret = proceedingJoinPoint.proceed(args);
            handleResult(ret);
            println("around execution method end");
            return ret;
        } catch(Throwable e){
            System.out.println(e.getMessage());
        }
        return 0;
    }

    /*
    @Around("executionMethod()")
    public void aroundExecutionMethod(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("### around execution method start");
        Object[] args = proceedingJoinPoint.getArgs();
        handleArgs(args);
        try{
            Object ret = proceedingJoinPoint.proceed(args);
            handleResult(ret);
            System.out.println("### around execution method end");
        } catch(Throwable e){
            System.out.println(e.getMessage());
        }
    }
    */

    private void handleArgs(Object[] args) {

    }

    private void handleResult(Object ret){

    }

    private void println(String msg) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("### ").append(getClass().getSimpleName()).append(" :  ").append(msg);
        System.out.println(stringBuilder.toString());
    }
}
