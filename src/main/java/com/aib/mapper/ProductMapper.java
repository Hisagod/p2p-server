package com.aib.mapper;

import com.aib.bean.ProductBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper {
    List<ProductBean> selectProductList();

    //随机获取某个产品
    ProductBean selectProduct();
}
