package com.ruijie.clouddesk.web.share.framework.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * <p>Title: ArgsAspect</p>
 * <p>Description: Function Description</p>
 * <p>Copyright: Ruijie Co., Ltd. (c) 2018</p>
 * <p>@Author: zhangsiming</p>
 * <p>@Date: 2018/5/22 14:36</p>
 *
 * 匹配参数的切面类
 */
@Aspect
@Component
public class ArgsAspect {

    @Pointcut("args(Long) && within(com.ruijie.clouddesk.web.share.framework.aop..*TargetServiceImpl)")
    public void matchArgs() {

    }
}
