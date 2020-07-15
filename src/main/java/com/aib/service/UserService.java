package com.aib.service;

import com.aib.bean.UserBean;

public interface UserService {
    UserBean findUser(String phone);

    int registerUser(String phone, String pwd);

    UserBean login(String phone, String pwd);
}
