package com.ruijie.clouddesk.web.share.framework.aop.dao;

import com.ruijie.clouddesk.web.share.framework.aop.domain.Product;

/**
 * <p>Title: ProductDao</p>
 * <p>Description: Function Description</p>
 * <p>Copyright: Ruijie Co., Ltd. (c) 2018</p>
 * <p>@Author: zhangsiming</p>
 * <p>@Date: 2018/5/22 15:03</p>
 */

public interface ProductDao {
    void save(Product product);
    void update();
    void delete();
}
