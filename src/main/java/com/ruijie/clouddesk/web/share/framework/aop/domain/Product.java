package com.ruijie.clouddesk.web.share.framework.aop.domain;

import com.ruijie.clouddesk.web.share.framework.aop.aspect.AnnotationClass;

/**
 * <p>Title: Product</p>
 * <p>Description: Function Description</p>
 * <p>Copyright: Ruijie Co., Ltd. (c) 2018</p>
 * <p>@Author: zhangsiming</p>
 * <p>@Date: 2018/5/21 17:49</p>
 */
@AnnotationClass
public class Product {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
    }
}
