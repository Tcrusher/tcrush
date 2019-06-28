package com.tcrush.entity.attendance;

public class Attendance {
    private String number;
    private String attendanceDate;
    private float overtime;
    private int leaving;
    private int holiday;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(String attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public float getOvertime() {
        return overtime;
    }

    public void setOvertime(float overtime) {
        this.overtime = overtime;
    }

    public int getLeaving() {
        return leaving;
    }

    public void setLeaving(int leaving) {
        this.leaving = leaving;
    }

    public int getHoliday() {
        return holiday;
    }

    public void setHoliday(int holiday) {
        this.holiday = holiday;
    }
}
