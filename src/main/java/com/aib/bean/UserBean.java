package com.aib.bean;

/**
 * 用户注册
 */
public class UserBean {
    private String id;
    private String phone;
    private String name;
    private String avatar;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getIscredit() {
        return iscredit;
    }

    public void setIscredit(Integer iscredit) {
        this.iscredit = iscredit;
    }

    private Integer iscredit;
}
