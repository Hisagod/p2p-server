package com.aib.controller;

import com.aib.bean.BannerBean;
import com.aib.bean.BaseBean;
import com.aib.bean.HomeBean;
import com.aib.bean.ProductBean;
import com.aib.service.BannerService;
import com.aib.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "banner")
public class BannerContoller {
    @Autowired
    BannerService service;
    @Autowired
    ProductService productService;

    @GetMapping(value = "getHome")
    private BaseBean<HomeBean> getBannerList() {
        List<BannerBean> bannerBeans = service.findBanner();
        BaseBean<HomeBean> baseBean = new BaseBean<>();
        HomeBean homeBean = new HomeBean();
        homeBean.setBanner(bannerBeans);
        ProductBean productBean = productService.getProduct();
        homeBean.setProduct(productBean);
        baseBean.setData(homeBean);
        baseBean.setMsg("获取成功");
        return baseBean;
    }
}
