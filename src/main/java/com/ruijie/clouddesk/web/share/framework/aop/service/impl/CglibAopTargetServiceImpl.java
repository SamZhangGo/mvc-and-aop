package com.ruijie.clouddesk.web.share.framework.aop.service.impl;

import com.ruijie.clouddesk.web.share.framework.aop.aspect.AnnotationClass;
import com.ruijie.clouddesk.web.share.framework.aop.aspect.AnnotationMethod;
import org.springframework.stereotype.Service;

/**
 * <p>Title: ProductService</p>
 * <p>Description: Function Description</p>
 * <p>Copyright: Ruijie Co., Ltd. (c) 2018</p>
 * <p>@Author: zhangsiming</p>
 * <p>@Date: 2018/5/21 17:51</p>
 */
@Service
@AnnotationClass
public class CglibAopTargetServiceImpl {

    @AnnotationMethod
    public void annotationMethod() {
        System.out.println("CglibAopTargetServiceImpl annotation method invoke");
    }


    public int executionMethod() {
        System.out.println("CglibAopTargetServiceImpl execution method invoke");
        return 1;
    }

    public void argsLong(Long id) {
        System.out.println("CglibAopTargetServiceImpl argsLong method invoke");
    }
}
