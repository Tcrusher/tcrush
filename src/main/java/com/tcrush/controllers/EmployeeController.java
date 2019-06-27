package com.tcrush.controllers;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.employee.Employee;
import com.tcrush.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @ResponseBody
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public BackRest insertEmployee(@RequestParam Map<String, String> map) {
        Employee employee = new Employee();
        employee.setNumber(map.get("number"));
        employee.setName(map.get("name"));
        employee.setSex(map.get("sex"));
        employee.setBirthday(map.get("birthday"));
        employee.setPhone(map.get("phone"));
        employee.setProfession(map.get("profession"));
        employee.setResume(map.get("resume"));
        BackRest backRest = employeeService.insertEmployeeService(employee);
        return backRest;
    }

    @ResponseBody
    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public BackRest selectEmployee(@ModelAttribute("number") String number) {
        BackRest backRest=employeeService.selectEmployeeService(number);
        return backRest;
    }

    @ResponseBody
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public BackRest deleteEmployee(@RequestParam Map<String, String> map) {
        String number = map.get("number");
        BackRest backRest = employeeService.deleteEmployeeService(number);
        return backRest;
    }

    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public BackRest upDateEmployee(@RequestParam Map<String, String> map) {
        Employee employee = new Employee();
        String number = map.get("number");
        employee.setNumber(map.get("number"));
        employee.setName(map.get("name"));
        employee.setSex(map.get("sex"));
        employee.setBirthday(map.get(""));
        employee.setPhone(map.get(""));
        employee.setProfession(map.get(""));
        employee.setResume(map.get(""));
        BackRest backRest=employeeService.upDateEmployeeService(number, employee);
        return backRest;
    }
}
