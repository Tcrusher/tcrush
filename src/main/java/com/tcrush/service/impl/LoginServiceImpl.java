package com.tcrush.service.impl;

import com.tcrush.dao.UserDao;
import com.tcrush.entity.BackRest;
import com.tcrush.entity.user.LoginInfo;
import com.tcrush.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserDao userDao;

    @Override
    public BackRest loginService(LoginInfo loginInfo) {
        BackRest backRest=new BackRest();
        int count=userDao.login(loginInfo);
        if(count>0) {
            backRest.setCode(200);
            backRest.setMassage("登录成功");
            return backRest;
        }
        backRest.setCode(-1);
        backRest.setMassage("用户名或密码错误");
        return backRest;
    }
}
