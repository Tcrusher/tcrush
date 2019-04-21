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
    BackRest backRest=new BackRest();
    @Override
    public BackRest register(UserInfo userInfo) {
        try {
            userDao.register(userInfo);
            backRest.setCode(200);
            backRest.setMassage("注册成功");
        }catch (Exception e) {
            e.printStackTrace();
            backRest.setCode(-1);
            backRest.setMassage("注册失败");
            return backRest;
        }
        return backRest;
    }
}
