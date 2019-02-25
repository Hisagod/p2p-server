package com.aib.controller;

import com.aib.bean.UserEntity;
import com.aib.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController {
    @Autowired
    private UserServiceImpl service;

    @RequestMapping(value = "/user/register", method = RequestMethod.POST)
    public String register(UserEntity entity, Model model) {
        String getPhone = entity.getPhone();
        System.out.println(getPhone);
//        service.findUser(getPhone);
        return "index";
    }
}
