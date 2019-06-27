package com.tcrush.controllers;

import com.tcrush.entity.BackRest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SalariesController {

    @ResponseBody
    @RequestMapping(value = "salaries/insert", method = RequestMethod.POST)
    public BackRest InsertSalaries() {
        return null;
    }

    @ResponseBody
    @RequestMapping(value = "salaries/select", method=RequestMethod.GET)
    public BackRest SelectSalaries() {
        return null;
    }
}
