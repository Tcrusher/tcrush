package com.tcrush.service.impl;

import com.tcrush.dao.UserDao;
import com.tcrush.entity.BackRest;
import com.tcrush.entity.user.UserInfo;
import com.tcrush.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    UserDao userDao;

    @Override
    public BackRest register(UserInfo userInfo) {
        try {
            userDao.register(userInfo);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
