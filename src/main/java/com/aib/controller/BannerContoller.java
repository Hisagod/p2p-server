package com.aib.controller;

import com.aib.bean.BannerBean;
import com.aib.bean.BaseBean;
import com.aib.bean.HomeBean;
import com.aib.bean.ProductBean;
import com.aib.service.BannerService;
import com.aib.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "首页数据")
@RestController
@RequestMapping(value = "banner")
public class BannerContoller {
    @Autowired
    BannerService service;
    @Autowired
    ProductService productService;

    @ApiOperation(
            value = "根据ID查找用户信息",
            notes = "查询数据库中某个用户的详细信息",
            response = HomeBean.class,
            httpMethod = "GET"
    )
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
