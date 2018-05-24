package com.ruijie.clouddesk.web.share.framework.aop.aspect;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * <p>Title: PkgTypeAspect</p>
 * <p>Description: Function Description</p>
 * <p>Copyright: Ruijie Co., Ltd. (c) 2018</p>
 * <p>@Author: zhangsiming</p>
 * <p>@Date: 2018/5/22 11:08</p>
 *
 * 匹配类型的切面类
 */
@Aspect
@Component
public class PkgTypeAspect {


    /**
     * 匹配某个类的所有方法
     */
    @Pointcut("within(com.ruijie.clouddesk.web.share.framework.aop..*TargetServiceImpl)")
    public void matchType(){

    }

    @Before("matchType()")
    public void before() {
        println("before matchType");
    }

    @After("matchType()")
    public void after() {
        println("after matchType");
    }

    @Around("matchType()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) {
        println("around matchType start");
        Object[] args = proceedingJoinPoint.getArgs();
//        handleArgs(args);
        try{
            Object ret = proceedingJoinPoint.proceed(args);
//            handleResult(ret);
            println("around matchType end");
            return ret;
        } catch(Throwable e){
            System.out.println(e.getMessage());
        }
        return 0;
    }


    @Pointcut("within(com.ruijie.clouddesk.web.share.framework.aop..*TargetServiceImpl) && @annotation(AnnotationMethod)")
    public void matchTypeAndAnnotation(){

    }

    @Before("matchTypeAndAnnotation()")
    public void beforeMatchTypeAndAnnotation() {
        println("before matchType and Annotation");
    }

    private void println(String msg) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("### ").append(getClass().getSimpleName()).append(" :  ").append(msg);
        System.out.println(stringBuilder.toString());
    }
}
