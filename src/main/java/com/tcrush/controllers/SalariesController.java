package com.tcrush.controllers;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.salary.Salaries;
import com.tcrush.service.impl.SalariesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class SalariesController {

    @Autowired
    SalariesServiceImpl salariesService;

    @ResponseBody
    @RequestMapping(value = "salaries/insert", method = RequestMethod.POST)
    public BackRest InsertSalaries(@RequestParam Map<String, Float> map) {
        Salaries salaries = new Salaries();
        salaries.setNumber(map.get("number") + "");
        salaries.setHistoryDate(map.get("historyDate") + "");
        salaries.setHistorySalary(map.get("historySalary"));
        BackRest backRest = salariesService.InsertSalaries(salaries);
        return backRest;
    }

    @ResponseBody
    @RequestMapping(value = "salaries/select", method = RequestMethod.GET)
    public BackRest SelectSalaries() {
        return null;
    }
}
