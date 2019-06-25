package com.tcrush.service;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.user.LoginInfo;
import com.tcrush.entity.user.UserInfo;

public interface UserService {
    BackRest loginService(LoginInfo loginInfo);
    BackRest register(UserInfo userInfo);
}
