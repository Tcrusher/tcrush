package com.tcrush.controllers;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.retirement.Retirement;
import com.tcrush.service.impl.RetirementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class RetirementController {

    @Autowired
    RetirementServiceImpl retirementService;

    @ResponseBody
    @RequestMapping(value = "retire/insert", method = RequestMethod.POST)
    public BackRest InsertRetire(@RequestParam Map<String, String> map) {
        Retirement retirement = new Retirement();
        retirement.setNumber(map.get("number"));
        retirement.setRetireDate("retireDate");
        retirement.setRemark("remark");
        BackRest backRest = retirementService.InsertRetireService(retirement);
        return backRest;
    }

    @ResponseBody
    @RequestMapping(value = "retire/select", method = RequestMethod.GET)
    public BackRest SelectRetire() {
        return null;
    }
}
