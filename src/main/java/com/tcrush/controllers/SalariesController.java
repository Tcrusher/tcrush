package com.tcrush.controllers;

import com.alibaba.fastjson.JSONObject;
import com.tcrush.entity.BackRest;
import com.tcrush.entity.salary.Salaries;
import com.tcrush.service.impl.SalariesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class SalariesController {

    @Autowired
    SalariesServiceImpl salariesService;

    @ResponseBody
    @RequestMapping(value = "salaries/insert", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public BackRest insertSalaries(@RequestBody JSONObject json) {
        Salaries salaries = new Salaries();
        salaries.setNumber(json.getString("number"));
        salaries.setHistoryDate(json.getString("historyDate"));
        salaries.setHistorySalary(json.getFloat("historySalary"));
        BackRest backRest = salariesService.insertSalaries(salaries);
        return backRest;
    }

    @ResponseBody
    @RequestMapping(value = "salaries/select", method = RequestMethod.GET)
    public BackRest selectSalaries(@RequestParam Map<String,String> map) {
        String number=map.get("number");
        BackRest backRest=salariesService.selectSalaries(number);
        return backRest;
    }
}
