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
    public BackRest InsertEmployee(@RequestParam Map<String, String> map) {
        Employee employee = new Employee();
        employee.setNumber(map.get("number"));
        employee.setName(map.get("name"));
        employee.setSex(map.get("sex"));
        employee.setBirthday(map.get("birthday"));
        employee.setPhone(map.get("phone"));
        employee.setProfession(map.get("profession"));
        employee.setResume(map.get("resume"));
        BackRest backRest = employeeService.InsertEmployeeService(employee);
        return backRest;
    }

    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public Employee SelectEmployee(@ModelAttribute("number") String number) {
        return null;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public BackRest DeleteEmployee(String number) {
        return null;
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public BackRest UpDateEmployee(String number, Employee employee) {
        return null;
    }
}
