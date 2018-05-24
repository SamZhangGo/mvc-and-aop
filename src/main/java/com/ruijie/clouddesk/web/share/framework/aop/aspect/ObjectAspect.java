package com.ruijie.clouddesk.web.share.framework.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * <p>Title: ObjectAspect</p>
 * <p>Description: Function Description</p>
 * <p>Copyright: Ruijie Co., Ltd. (c) 2018</p>
 * <p>@Author: zhangsiming</p>
 * <p>@Date: 2018/5/22 9:31</p>
 *
 * 匹配对象的切面类
 */
@Aspect
@Component
public class ObjectAspect {

    /**
     * 匹配com.ruijie.clouddesk..*Service接口的目标对象的方法
     */
    @Pointcut("target(com.ruijie.clouddesk..*Service)")
    public void targetPointcut(){

    }

    /**
     * 匹配
     */
    @Pointcut("this(com.ruijie.clouddesk..*ServiceImpl)")
    public void thisPointcut() {

    }

    /**
     * 匹配以Service结尾的所有bean的方法
     */
    @Pointcut("bean(*Service)")
    public void beanPointcut() {

    }


    private void println(String msg) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("### ").append(getClass().getSimpleName()).append(" :  ").append(msg);
        System.out.println(stringBuilder.toString());
    }
}
