package com.aib.controller;

import com.aib.bean.BaseBean;
import com.aib.bean.UserEntity;
import com.aib.service.impl.UserServiceImpl;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    private UserServiceImpl service;

    @RequestMapping(path = "/register", method = RequestMethod.POST)
    public String register(UserEntity entity, Model model) {
        String getPhone = entity.getPhone();
        UserEntity user = service.findUser(getPhone);
        if (user == null) {
            service.registerUser(entity);
            if (entity.getId() != 0) {
                BaseBean<String> baseEntity = new BaseBean<>();
                baseEntity.setCode(200);
                baseEntity.setMsg("注册成功");
                String json = new Gson().toJson(baseEntity);
                model.addAttribute("json", json);
            }
        } else {
            BaseBean<String> baseEntity = new BaseBean<>();
            baseEntity.setCode(200);
            baseEntity.setMsg("该手机号已注册");
            String json = new Gson().toJson(baseEntity);
            model.addAttribute("json", json);
        }
        return "index";
    }

    @RequestMapping(path = "/test")
    private String test(Model model) {
        model.addAttribute("json", "哈哈");
        return "index";
    }
}
