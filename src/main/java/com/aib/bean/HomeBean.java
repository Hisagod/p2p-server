package com.aib.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value = "首页数据")
public class HomeBean {
    @ApiModelProperty(
            value = "Banner数据",
            name = "banner",
            dataType = "Object",
            required = true
    )
    private List<BannerBean> banner;

    @ApiModelProperty(
            value = "产品数据",
            name = "product",
            dataType = "Object",
            required = true
    )
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
