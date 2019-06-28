package com.tcrush.service.impl;

import com.tcrush.dao.AttendanceDao;
import com.tcrush.entity.BackRest;
import com.tcrush.entity.attendance.Attendance;
import com.tcrush.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    AttendanceDao attendanceDao;

    BackRest backRest = new BackRest();

    @Override
    public BackRest insertAttendance(Attendance attendance) {
        try {
            attendanceDao.insertAttendance(attendance);
            backRest.setCode(200);
            backRest.setMassage("增添考勤信息成功");
            backRest.setData(null);
        } catch (Exception e) {
            e.printStackTrace();
            attendanceDao.insertAttendance(attendance);
            backRest.setCode(-1);
            backRest.setMassage("增添考勤信息失败");
            backRest.setData(null);
        }
        return backRest;
    }

    @Override
    public BackRest deleteAttendance(String number) {
        try {
            attendanceDao.deleteAttendance(number);
            backRest.setCode(200);
            backRest.setMassage("删除考勤信息成功");
            backRest.setData(null);
        } catch (Exception e) {
            e.printStackTrace();
            backRest.setCode(-1);
            backRest.setMassage("删除考勤信息失败");
            backRest.setData(null);
        }
        return backRest;
    }

    @Override
    public BackRest selectAttendance(String number) {
        try {
            List<Attendance> attendances=attendanceDao.selectAttendance(number);
            backRest.setCode(200);
            backRest.setMassage("查询考勤信息成功");
            backRest.setData(attendances);
        } catch (Exception e) {
            e.printStackTrace();
            backRest.setCode(-1);
            backRest.setMassage("查询考勤信息失败");
            backRest.setData(null);
        }
        return backRest;
    }

    @Override
    public BackRest upDateAttendance(Attendance attendance) {
        try {
            attendanceDao.upDateAttendance(attendance);
            backRest.setCode(200);
            backRest.setMassage("更新考勤信息成功");
            backRest.setData(null);
        } catch (Exception e) {
            e.printStackTrace();
            backRest.setCode(-1);
            backRest.setMassage("更新考勤信息失败");
            backRest.setData(null);
        }
        return backRest;
    }
}
