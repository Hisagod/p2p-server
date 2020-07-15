package com.aib.service.impl;

import com.aib.bean.UserBean;
import com.aib.mapper.UserMapper;
import com.aib.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public UserBean findUser(String phone) {
        return mapper.findUserByPhone(phone);
    }

    @Override
    public int registerUser(String phone, String pwd) {
        return mapper.registerUser(phone, pwd);
    }

    @Override
    public UserBean login(String phone, String pwd) {
        UserBean userBean = mapper.login(phone, pwd);
        return userBean;
    }
}
