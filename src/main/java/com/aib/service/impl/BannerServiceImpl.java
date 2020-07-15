package com.aib.service.impl;

import com.aib.bean.BannerBean;
import com.aib.mapper.BannerMapper;
import com.aib.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    BannerMapper mapper;

    @Override
    public List<BannerBean> findBanner() {
        return mapper.findAllBanner();
    }
}
