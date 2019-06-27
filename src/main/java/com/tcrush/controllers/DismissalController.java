package com.tcrush.controllers;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.dismissal.Dismissal;
import com.tcrush.service.impl.DismissalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class DismissalController {

    @Autowired
    DismissalServiceImpl dismissalService;

    @ResponseBody
    @RequestMapping(value = "/dismissal/insert", method = RequestMethod.POST)
    public BackRest insertDismissal(@RequestParam Map<String, String> map) {
        Dismissal dismissal = new Dismissal();
        dismissal.setNumber(map.get("number"));
        dismissal.setDismissalDate(map.get("dismissalDate"));
        dismissal.setDismissalLetter(map.get("dismissalLetter"));
        dismissal.setReason(map.get("reason"));
        dismissal.setRemark(map.get("remark"));
        BackRest backRest = dismissalService.insertDismissalService(dismissal);
        return backRest;
    }

    @ResponseBody
    @RequestMapping(value = "/dismissal/select", method = RequestMethod.GET)
    public BackRest selectDismissal(@RequestParam Map<String, String> map) {
        String number = map.get("number");
        BackRest backRest = dismissalService.selectDismissalService(number);
        return backRest;
    }
}
