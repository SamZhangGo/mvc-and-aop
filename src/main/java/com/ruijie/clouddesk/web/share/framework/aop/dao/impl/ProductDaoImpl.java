package com.ruijie.clouddesk.web.share.framework.aop.dao.impl;

import com.ruijie.clouddesk.web.share.framework.aop.dao.ProductDao;
import com.ruijie.clouddesk.web.share.framework.aop.domain.Product;
import org.springframework.stereotype.Repository;

/**
 * <p>Title: ProductDaoImpl</p>
 * <p>Description: Function Description</p>
 * <p>Copyright: Ruijie Co., Ltd. (c) 2018</p>
 * <p>@Author: zhangsiming</p>
 * <p>@Date: 2018/5/22 15:03</p>
 */
@Repository("productDao")
public class ProductDaoImpl implements ProductDao {

    @Override
    public void save(Product product) {
        System.out.println("ProductDaoImpl save");
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
