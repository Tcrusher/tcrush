package com.tcrush.controllers;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.salary.Salary;
import com.tcrush.service.impl.SalaryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class SalaryController {

    @Autowired
    SalaryServiceImpl salaryService;

    @ResponseBody
    @RequestMapping(value = "salary/insert", method = RequestMethod.POST)
    public BackRest insertSalary(@RequestParam Map<String, Float> map) {
        Salary salary = new Salary();
        salary.setNumber(map.get("number") + "");
        salary.setHistoryDate(map.get("historyDate") + "");
        salary.setCurrentSalary(map.get("currentSalary"));
        salary.setPersonalTax(map.get("personalTax"));
        salary.setAward(map.get("award"));
        salary.setPunishment(map.get("punishment"));
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
