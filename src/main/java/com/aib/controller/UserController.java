package com.aib.controller;

import com.aib.bean.BaseBean;
import com.aib.bean.UserBean;
import com.aib.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserServiceImpl service;

    @PostMapping(value = "register")
    public BaseBean<Object> register(String phone, String pwd) {
        BaseBean<Object> baseBean = new BaseBean<>();

        UserBean userBean = service.findUser(phone);
        if (userBean != null) {
            baseBean.setCode(2);
            baseBean.setMsg("账号已注册");
            return baseBean;
        }

        int user = service.registerUser(phone, pwd);
        if (user != 0) {
            baseBean.setMsg("注册成功");
        }

        return baseBean;
    }

    @PostMapping(value = "login")
    private BaseBean<UserBean> login(String phone, String pwd) {
        BaseBean<UserBean> baseBean = new BaseBean<>();

        //1.检查用户是否注册
        UserBean isRegisterBean = service.findUser(phone);
        if (isRegisterBean == null) {
            baseBean.setMsg("账户未注册");
            baseBean.setCode(1);
            return baseBean;
        }

        //2.已注册，直接查出用户数据
        UserBean userBean = service.login(phone, pwd);
        if (userBean == null) {
            baseBean.setMsg("密码错误");
            baseBean.setCode(3);
            return baseBean;
        }

        baseBean.setCode(0);
        baseBean.setMsg("登录成功");
        baseBean.setData(userBean);
        return baseBean;
    }

    /**
     * 头像上传
     */
    @PostMapping(value = "uploadAvatar")
    private void uploadAvatar(MultipartFile file) {
        
    }
}
