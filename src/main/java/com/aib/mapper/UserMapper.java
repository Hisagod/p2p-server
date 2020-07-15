package com.aib.mapper;

import com.aib.bean.UserBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    /**
     * 根据用户手机号查询用户
     */
    UserBean findUserByPhone(String phone);

    int registerUser(@Param("phone") String phone, @Param("pwd") String pwd);

    UserBean login(@Param("phone") String phone, @Param("pwd") String pwd);
}
