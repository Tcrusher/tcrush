package com.tcrush.entity.dismissal;

public class Dismissal {
    private String number;
    private String dismissalDate;
    private String dismissalLetter;
    private String reason;
    private String remark;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDismissalDate() {
        return dismissalDate;
    }

    public void setDismissalDate(String dismissalDate) {
        this.dismissalDate = dismissalDate;
    }

    public String getDismissalLetter() {
        return dismissalLetter;
    }

    public void setDismissalLetter(String dismissalLetter) {
        this.dismissalLetter = dismissalLetter;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
