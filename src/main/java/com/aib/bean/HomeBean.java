package com.aib.bean;

import java.util.List;

public class HomeBean {
    private List<BannerBean> banner;
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
