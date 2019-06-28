package com.tcrush.entity.insurance;

public class Insurance {
    private String number;
    private float retireInsurance;
    private float medicalInsurance;
    private float fund;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public float getRerireInsurance() {
        return retireInsurance;
    }

    public void setRetireInsurance(float retireInsurance) {
        this.retireInsurance = retireInsurance;
    }

    public float getMedicalInsurance() {
        return medicalInsurance;
    }

    public void setMedicalInsurance(float medicalInsurance) {
        this.medicalInsurance = medicalInsurance;
    }

    public float getFund() {
        return fund;
    }

    public void setFund(float fund) {
        this.fund = fund;
    }
}
