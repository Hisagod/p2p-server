package com.aib.service;

import com.aib.bean.UserEntity;

public interface UserService {
    UserEntity findUser(String phone);

    void registerUser(UserEntity entity);
}
