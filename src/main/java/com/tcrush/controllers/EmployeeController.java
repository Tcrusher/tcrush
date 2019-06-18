package com.tcrush.controllers;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.employee.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class EmployeeController {

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public BackRest InsertEmployee(@RequestParam Map<String,String> map) {
        return null;
    }

    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public Employee SelectEmployee(@ModelAttribute("number") String number) {
        return null;
    }

    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public BackRest DeleteEmployee(String number) {
        return null;
    }

    public BackRest UpDateEmployee(String number, Employee employee) {
        return null;
    }
}
