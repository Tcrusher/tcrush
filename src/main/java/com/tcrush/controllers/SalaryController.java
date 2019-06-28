package com.tcrush.controllers;

import com.alibaba.fastjson.JSONObject;
import com.tcrush.entity.BackRest;
import com.tcrush.entity.salary.Salary;
import com.tcrush.service.impl.SalaryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class SalaryController {

    @Autowired
    SalaryServiceImpl salaryService;

    @ResponseBody
    @RequestMapping(value = "salary/insert", method = RequestMethod.POST)
    public BackRest insertSalary(@RequestBody JSONObject jsonObject) {
        Salary salary = new Salary();
        salary.setNumber(jsonObject.getString("number"));
        salary.setHistoryDate(jsonObject.getString("historyDate"));
        salary.setCurrentSalary(jsonObject.getFloat("currentSalary"));
        salary.setPersonalTax(jsonObject.getFloat("personalTax"));
        salary.setAward(jsonObject.getFloat("award"));
        salary.setPunishment(jsonObject.getFloat("punishment"));
        BackRest backRest = salaryService.insertSalary(salary);
        return backRest;
    }

    @ResponseBody
    @RequestMapping(value = "salary/select", method = RequestMethod.GET)
    public BackRest selectSalary(@RequestParam Map<String,String> map) {
        String number=map.get("number");
        BackRest backRest=salaryService.selectSalary(number);
        return backRest;
    }
}
