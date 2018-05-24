package com.ruijie.clouddesk.web.share.framework.aop.service.impl;


import com.ruijie.clouddesk.web.share.framework.aop.base.BaseTestClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>Title: CglibAopTargetServiceImplTest</p>
 * <p>Description: Function Description</p>
 * <p>Copyright: Ruijie Co., Ltd. (c) 2018</p>
 * <p>@Author: zhangsiming</p>
 * <p>@Date: 2018/5/22 10:34</p>
 */
public class CglibAopTargetServiceImplTest extends BaseTestClass {

    @Autowired
    CglibAopTargetServiceImpl aopTargetService;
    @Test
    public void testAnnotationMethod() {
        aopTargetService.annotationMethod();
    }

    @Test
    public void testExecutionMethod() {
        aopTargetService.executionMethod();
    }

}