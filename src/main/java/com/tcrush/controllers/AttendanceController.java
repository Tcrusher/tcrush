package com.tcrush.controllers;

import com.alibaba.fastjson.JSONObject;
import com.tcrush.entity.BackRest;
import com.tcrush.entity.attendance.Attendance;
import com.tcrush.service.impl.AttendanceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping(value = "attendance")
public class AttendanceController {

    @Autowired
    AttendanceServiceImpl attendanceService;

    @ResponseBody
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public BackRest insertAttendance(@RequestBody JSONObject jsonObject) {
        Attendance attendance = new Attendance();
        attendance.setNumber(jsonObject.getString("number"));
        attendance.setAttendanceDate(jsonObject.getString("attendanceDate"));
        attendance.setOvertime(jsonObject.getFloat("overtime"));
        attendance.setLeaving(jsonObject.getInteger("leaving"));
        attendance.setHoliday(jsonObject.getInteger("holiday"));
        BackRest backRest = attendanceService.insertAttendance(attendance);
        return backRest;
    }

    @ResponseBody
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public BackRest deleteAttendance(@RequestParam Map<String, String> map) {
        String number = map.get("number");
        BackRest backRest = attendanceService.deleteAttendance(number);
        return backRest;
    }

    @ResponseBody
    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public BackRest selectAttendance(@RequestParam Map<String, String> map) {
        String number = map.get("number");
        BackRest backRest = attendanceService.selectAttendance(number);
        return backRest;
    }

    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public BackRest upDateAttendance(@RequestBody JSONObject jsonObject) {
        Attendance attendance = new Attendance();
        attendance.setNumber(jsonObject.getString("number"));
        attendance.setAttendanceDate(jsonObject.getString("attendanceDate"));
        attendance.setOvertime(jsonObject.getFloat("overtime"));
        attendance.setLeaving(jsonObject.getInteger("leaving"));
        attendance.setHoliday(jsonObject.getInteger("holiday"));
        BackRest backRest = attendanceService.upDateAttendance(attendance);
        return backRest;
    }
}
