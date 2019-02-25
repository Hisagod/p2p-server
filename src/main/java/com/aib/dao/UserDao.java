package com.aib.dao;

import com.aib.bean.UserEntity;

public interface UserDao {
    /**
     * 根据用户手机号查询用户
     *
     * @param phone
     * @return
     */
    UserEntity findUserByPhone(String phone);

    void registerUser(UserEntity entity);
}
