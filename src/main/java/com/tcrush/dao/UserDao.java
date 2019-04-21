package com.tcrush.dao;

import com.tcrush.entity.user.LoginInfo;
import com.tcrush.entity.user.UserInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    int login(LoginInfo loginInfo);
    void register(UserInfo userInfo);
}
