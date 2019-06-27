package com.tcrush.entity.salary;

public class Salary {
    private String number;
    private String historyDate;
    private float currentSalary;
    private float personalTax;
    private float award;
    private float punishment;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHistoryDate() {
        return historyDate;
    }

    public void setHistoryDate(String historyDate) {
        this.historyDate = historyDate;
    }

    public float getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(float currentSalary) {
        this.currentSalary = currentSalary;
    }

    public float getPersonalTax() {
        return personalTax;
    }

    public void setPersonalTax(float personalTax) {
        this.personalTax = personalTax;
    }

    public float getAward() {
        return award;
    }

    public void setAward(float award) {
        this.award = award;
    }

    public float getPunishment() {
        return punishment;
    }

    public void setPunishment(float punishment) {
        this.punishment = punishment;
    }
}
