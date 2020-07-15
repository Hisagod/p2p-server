package com.aib.controller;

import com.aib.bean.BaseBean;
import com.aib.bean.ProductBean;
import com.aib.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "product")
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping(value = "getProduct")
    private BaseBean<List<ProductBean>> getProduct() {
        List<ProductBean> productList = service.getProductList();
        BaseBean<List<ProductBean>> baseBean = new BaseBean<>();
        baseBean.setData(productList);
        baseBean.setMsg("获取成功");
        return baseBean;
    }
}
