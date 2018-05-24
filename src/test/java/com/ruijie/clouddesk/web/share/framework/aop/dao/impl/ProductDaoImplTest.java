package com.ruijie.clouddesk.web.share.framework.aop.dao.impl;


import com.ruijie.clouddesk.web.share.framework.aop.base.BaseTestClass;
import com.ruijie.clouddesk.web.share.framework.aop.dao.ProductDao;
import com.ruijie.clouddesk.web.share.framework.aop.domain.Product;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>Title: ProductDaoImplTest</p>
 * <p>Description: Function Description</p>
 * <p>Copyright: Ruijie Co., Ltd. (c) 2018</p>
 * <p>@Author: zhangsiming</p>
 * <p>@Date: 2018/5/22 15:11</p>
 */

public class ProductDaoImplTest extends BaseTestClass {
    @Autowired
    ProductDao productDao;

    @Test
    public void testSave() {
        Product product = new Product();
        product.setId(1l);
        product.setName("car");
        productDao.save(product);
    }
}