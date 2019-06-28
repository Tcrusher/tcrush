package com.tcrush.service;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.insurance.Insurance;

public interface InsuranceService {
    BackRest insertInsurance(Insurance insurance);
    BackRest deleteInsurance(String number);
    BackRest selectInsurance(String number);
    BackRest upDateInsurance(Insurance insurance);
}
