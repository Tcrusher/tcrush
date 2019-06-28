package com.tcrush.dao;

import com.tcrush.entity.attendance.Attendance;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttendanceDao {
    void insertAttendance(Attendance attendance);
    void deleteAttendance(String number);
    List<Attendance> selectAttendance(String number);
    void upDateAttendance(Attendance attendance);
}
