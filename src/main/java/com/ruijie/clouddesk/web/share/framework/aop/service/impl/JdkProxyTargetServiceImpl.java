package com.ruijie.clouddesk.web.share.framework.aop.service.impl;

import com.ruijie.clouddesk.web.share.framework.aop.aspect.AnnotationMethod;
import com.ruijie.clouddesk.web.share.framework.aop.service.JdkProxyTargetService;
import org.springframework.stereotype.Service;

/**
 * <p>Title: JdkProxyTargetServiceImpl</p>
 * <p>Description: Function Description</p>
 * <p>Copyright: Ruijie Co., Ltd. (c) 2018</p>
 * <p>@Author: zhangsiming</p>
 * <p>@Date: 2018/5/22 10:11</p>
 */
@Service("jdkProxyTargetService")
public class JdkProxyTargetServiceImpl implements JdkProxyTargetService {

    @AnnotationMethod
    @Override
    public void annotationMethod() {
        System.out.println("JdkProxyTargetServiceImpl annotation method invoke");
    }

    @Override
    public int executionMethod() {
        System.out.println("JdkProxyTargetServiceImpl execution method invoke");
        return 0;
    }
}
