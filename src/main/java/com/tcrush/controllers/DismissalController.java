package com.tcrush.controllers;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.dismissal.Dismissal;
import com.tcrush.service.DismissalService;
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
    DismissalService dismissalService;

    @ResponseBody
    @RequestMapping(value = "/dismissal/insert", method = RequestMethod.POST)
    public BackRest InsertDismissal(@RequestParam Map<String, String> map) {
        Dismissal dismissal=new Dismissal();
        dismissal.setNumber(map.get("number"));
        dismissal.setDismissalDate(map.get("dismissalDate"));
        dismissal.setDismissalLetter(map.get("dismissalLetter"));
        dismissal.setReason(map.get("reason"));
        dismissal.setRemark(map.get("remark"));
        BackRest backRest = dismissalService.InsertDismissalService(dismissal);
        return backRest;
    }

    @ResponseBody
    @RequestMapping(value = "/dismissal/select", method = RequestMethod.GET)
    public BackRest SelectDismissal() {
        return null;
    }
}
