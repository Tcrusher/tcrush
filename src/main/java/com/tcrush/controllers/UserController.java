package com.tcrush.controllers;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.user.LoginInfo;
import com.tcrush.entity.user.UserInfo;
import com.tcrush.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public BackRest login(@ModelAttribute("username") String username, @ModelAttribute("password") String password) {
        LoginInfo loginInfo = new LoginInfo();
        loginInfo.setUserName(username);
        loginInfo.setPassword(password);
        System.out.println(username+":"+password);
        BackRest backRest = userService.loginService(loginInfo);
        return backRest;
    }

    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public BackRest register(@RequestParam Map<String, String> map) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(map.get("username"));
        userInfo.setPassword(map.get("password"));
        userInfo.setEmail(map.get("email"));
        BackRest backRest = userService.register(userInfo);
        return backRest;
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
