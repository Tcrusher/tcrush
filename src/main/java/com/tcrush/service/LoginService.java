package com.tcrush.service;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.user.LoginInfo;

public interface LoginService {
    BackRest loginService(LoginInfo loginInfo);
}
