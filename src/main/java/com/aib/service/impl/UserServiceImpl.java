package com.aib.service.impl;

import com.aib.bean.UserEntity;
import com.aib.mapper.UserMapper;
import com.aib.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public UserEntity findUser(String phone) {
        return mapper.findUserByPhone(phone);
    }

    @Override
    public void registerUser(UserEntity entity) {
        mapper.registerUser(entity);
    }
}
