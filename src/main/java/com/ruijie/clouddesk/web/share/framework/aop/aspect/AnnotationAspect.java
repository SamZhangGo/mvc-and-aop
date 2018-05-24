package com.ruijie.clouddesk.web.share.framework.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * <p>Title: SecurityAspect</p>
 * <p>Description: Function Description</p>
 * <p>Copyright: Ruijie Co., Ltd. (c) 2018</p>
 * <p>@Author: zhangsiming</p>
 * <p>@Date: 2018/5/21 21:56</p>
 *
 * 匹配注解的切面类
 */
@Aspect
@Component
public class AnnotationAspect {

    @Pointcut("@annotation(AnnotationMethod)")
    public void annotationMethod(){

    }

    @Before("annotationMethod()")
    public void beforeAnnotationMethodInvoke() {
        println("before annotation method invoke");
    }

    @After("annotationMethod()")
    public void afterAnnotationMethodInvoke() {
        println("after annotation method invoke");
    }

    private void println(String msg) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("### ").append(getClass().getSimpleName()).append(" :  ").append(msg);
        System.out.println(stringBuilder.toString());
    }

    @Pointcut("@within(com.ruijie.clouddesk.web.share.framework.aop.aspect.AnnotationClass)")
    public void annoWithinPointcut() {

    }

    @Before("annoWithinPointcut()")
    public void beforeAnnoWithPointcut() {
        println("before annoWithinPointcut");
    }

    @Pointcut("@target(org.springframework.stereotype.Service)")
    public void annoTargetPointcut() {

    }

    @Pointcut("@args(com.ruijie.clouddesk.web.share.framework.aop.aspect.AnnotationClass) && @within(org.springframework.stereotype.Repository)")
    public void annoArgsPointcut() {

    }

    @Before("annoArgsPointcut()")
    public void beforeAnnoArgsPointcut() {
        println("before annoArgsPointcut");
    }
}
