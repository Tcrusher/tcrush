package com.tcrush.controllers;

import com.tcrush.entity.BackRest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SalaryController {

    @ResponseBody
    @RequestMapping(value = "salary/insert", method = RequestMethod.POST)
    public BackRest InsertSalary() {
        return null;
    }

    @ResponseBody
    @RequestMapping(value = "salary/select", method = RequestMethod.GET)
    public BackRest SelectSalary() {
        return null;
    }
}
