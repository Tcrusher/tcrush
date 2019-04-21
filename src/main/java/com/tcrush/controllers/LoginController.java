package com.tcrush.controllers;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.user.LoginInfo;
import com.tcrush.service.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    LoginServiceImpl loginService;

    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public BackRest login(@RequestParam Map<String,String> map) {
        LoginInfo loginInfo=new LoginInfo();
        loginInfo.setUserName(map.get("Username"));
        loginInfo.setPassword(map.get("Password"));
        BackRest backRest=loginService.loginService(loginInfo);
        return backRest;
    }
}
