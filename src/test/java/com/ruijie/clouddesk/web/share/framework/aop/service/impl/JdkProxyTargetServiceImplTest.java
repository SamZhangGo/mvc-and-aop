package com.ruijie.clouddesk.web.share.framework.aop.service.impl;


import com.ruijie.clouddesk.web.share.framework.aop.base.BaseTestClass;
import com.ruijie.clouddesk.web.share.framework.aop.service.JdkProxyTargetService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>Title: JdkProxyTargetServiceImplTest</p>
 * <p>Description: Function Description</p>
 * <p>Copyright: Ruijie Co., Ltd. (c) 2018</p>
 * <p>@Author: zhangsiming</p>
 * <p>@Date: 2018/5/22 10:39</p>
 */

public class JdkProxyTargetServiceImplTest extends BaseTestClass {

    @Autowired
    JdkProxyTargetService aopTargetService;

    @Test
    public void testAnnotationMethod() {
        aopTargetService.annotationMethod();
    }

    @Test
    public void testExecutionMethod() {
        aopTargetService.executionMethod();
    }

}