package com.tcrush.service;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.attendance.Attendance;

public interface AttendanceService {
    BackRest insertAttendance(Attendance attendance);
    BackRest deleteAttendance(String number);
    BackRest selectAttendance(String number);
    BackRest upDateAttendance(Attendance attendance);
}
