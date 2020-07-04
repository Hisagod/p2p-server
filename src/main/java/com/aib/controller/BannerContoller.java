package com.aib.controller;

import com.aib.bean.BannerBean;
import com.aib.bean.BaseBean;
import com.aib.service.BannerService;
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

    @GetMapping(value = "getBannerList")
    private BaseBean<List<BannerBean>> getBannerList() {
        List<BannerBean> bannerBeans = service.findBanner();
        BaseBean<List<BannerBean>> baseBean = new BaseBean<>();
        baseBean.setCode(0);
        baseBean.setData(bannerBeans);
        baseBean.setMsg("查询成功");
        return baseBean;
    }
}
