package com.aib.service;

import com.aib.bean.ProductBean;

import java.util.List;

public interface ProductService {
    List<ProductBean> getProductList();

    ProductBean getProduct();
}
