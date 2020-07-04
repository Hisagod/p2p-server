package com.aib.mapper;

import com.aib.bean.BannerBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BannerMapper {
    List<BannerBean> findAllBanner();
}
