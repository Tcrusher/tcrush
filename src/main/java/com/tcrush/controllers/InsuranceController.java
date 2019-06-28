package com.tcrush.controllers;

import com.tcrush.entity.BackRest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InsuranceController {

    @ResponseBody
    @RequestMapping(value = "insurance/insert", method = RequestMethod.POST)
    public BackRest insertInsurance() {
        return null;
    }

    @ResponseBody
    @RequestMapping(value = "insurance/delete", method = RequestMethod.GET)
    public BackRest deleteInsurance() {
        return null;
    }

    @ResponseBody
    @RequestMapping(value = "insurance/select", method = RequestMethod.GET)
    public BackRest selectInsurance() {
        return null;
    }

    @ResponseBody
    @RequestMapping(value = "insurance/update", method = RequestMethod.POST)
    public BackRest upDateInsurance() {
        return null;
    }
}
