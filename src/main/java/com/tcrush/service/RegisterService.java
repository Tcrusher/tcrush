package com.tcrush.service;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.user.UserInfo;

public interface RegisterService {
    BackRest register(UserInfo userInfo);
}
