package com.aib.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value = "首页数据")
public class HomeBean {
    @ApiModelProperty("Banner")
    private List<BannerBean> banner;

    @ApiModelProperty("产品")
    private ProductBean product;

    public List<BannerBean> getBanner() {
        return banner;
    }

    public void setBanner(List<BannerBean> banner) {
        this.banner = banner;
    }

    public ProductBean getProduct() {
        return product;
    }

    public void setProduct(ProductBean product) {
        this.product = product;
    }
}
