package com.tcrush.controllers;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.user.LoginInfo;
import com.tcrush.service.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    LoginServiceImpl loginService;

    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public BackRest login(@ModelAttribute("username") String username, @ModelAttribute("password") String password) {
        LoginInfo loginInfo=new LoginInfo();
        loginInfo.setUserName(username);
        loginInfo.setPassword(password);
        System.out.println(username+" data "+password);
        BackRest backRest=loginService.loginService(loginInfo);
        return backRest;
    }
    @RequestMapping("/")
    public String index() {
        return "login/login";
    }
}
