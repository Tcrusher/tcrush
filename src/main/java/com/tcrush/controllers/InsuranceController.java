package com.tcrush.controllers;

import com.alibaba.fastjson.JSONObject;
import com.tcrush.entity.BackRest;
import com.tcrush.entity.insurance.Insurance;
import com.tcrush.service.impl.InsuranceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping(value = "insurance")
public class InsuranceController {

    @Autowired
    InsuranceServiceImpl insuranceService;

    @ResponseBody
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public BackRest insertInsurance(@RequestBody JSONObject jsonObject) {
        Insurance insurance = new Insurance();
        insurance.setNumber(jsonObject.getString("number"));
        insurance.setRetireInsurance(jsonObject.getFloat("retireInsurance"));
        insurance.setMedicalInsurance(jsonObject.getFloat("medicalInsurance"));
        insurance.setFund(jsonObject.getFloat("fund"));
        BackRest backRest = insuranceService.insertInsurance(insurance);
        return backRest;
    }

    @ResponseBody
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public BackRest deleteInsurance(@RequestParam Map<String, String> map) {
        String number = map.get("number");
        BackRest backRest = insuranceService.deleteInsurance(number);
        return backRest;
    }

    @ResponseBody
    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public BackRest selectInsurance(@RequestParam Map<String, String> map) {
        String number = map.get("number");
        BackRest backRest = insuranceService.selectInsurance(number);
        return backRest;
    }

    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public BackRest upDateInsurance(@RequestBody JSONObject jsonObject) {
        Insurance insurance = new Insurance();
        insurance.setNumber(jsonObject.getString("number"));
        insurance.setRetireInsurance(jsonObject.getFloat("retireInsurance"));
        insurance.setMedicalInsurance(jsonObject.getFloat("medicalInsurance"));
        insurance.setFund(jsonObject.getFloat("fund"));
        BackRest backRest = insuranceService.upDateInsurance(insurance);
        return backRest;
    }
}
