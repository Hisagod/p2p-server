package com.aib.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Banner数据")
public class BannerBean {
    @ApiModelProperty(value = "id",example = "1")
    private int id;
    @ApiModelProperty(value = "图片", example = "http://127.0.0.1:8080/test.png")
    private String img;
    @ApiModelProperty(value = "跳转URL", example = "http://127.0.0.1:8080/test.html")
    private String url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
