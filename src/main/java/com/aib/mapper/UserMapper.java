package com.aib.mapper;

import com.aib.bean.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    /**
     * 根据用户手机号查询用户
     *
     * @param phone
     * @return
     */
    UserEntity findUserByPhone(String phone);

    void registerUser(UserEntity entity);
}
