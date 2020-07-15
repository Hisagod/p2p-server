package com.aib.service.impl;

import com.aib.bean.ProductBean;
import com.aib.mapper.ProductMapper;
import com.aib.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper mapper;


    @Override
    public List<ProductBean> getProductList() {
        return mapper.selectProductList();
    }

    @Override
    public ProductBean getProduct() {
        return mapper.selectProduct();
    }
}
