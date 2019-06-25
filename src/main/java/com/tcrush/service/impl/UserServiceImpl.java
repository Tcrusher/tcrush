package com.tcrush.service.impl;

import com.tcrush.dao.UserDao;
import com.tcrush.entity.BackRest;
import com.tcrush.entity.user.LoginInfo;
import com.tcrush.entity.user.UserInfo;
import com.tcrush.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    BackRest backRest=new BackRest();

    @Override
    public BackRest loginService(LoginInfo loginInfo) {
        int count=userDao.login(loginInfo);
        if(count>0) {
            backRest.setCode(200);
            backRest.setMassage("登录成功");
            backRest.setData(null);
            return backRest;
        }
        backRest.setCode(-1);
        backRest.setMassage("用户名或密码错误");
        backRest.setData(null);
        return backRest;
    }

    @Override
    public BackRest register(UserInfo userInfo) {
        try {
            userDao.register(userInfo);
            backRest.setCode(200);
            backRest.setMassage("注册成功");
            backRest.setData(null);
        } catch (Exception e) {
            e.printStackTrace();
            backRest.setCode(-1);
            backRest.setMassage("注册失败");
            backRest.setData(null);
            return backRest;
        }
        return backRest;
    }
}
