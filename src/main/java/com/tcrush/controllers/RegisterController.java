package com.tcrush.controllers;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.user.UserInfo;
import com.tcrush.service.impl.RegisterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class RegisterController {
    @Autowired
    RegisterServiceImpl registerService;

    @ResponseBody
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public BackRest register(@RequestParam Map<String,String> map) {
        UserInfo userInfo=new UserInfo();
        userInfo.setUserName(map.get("Username"));
        userInfo.setPassword(map.get("Password"));
        userInfo.setEmail(map.get("Email"));
        registerService.register(userInfo);
        return null;
    }
}
