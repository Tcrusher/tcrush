package com.tcrush.service;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.retirement.Retirement;

public interface RetirementService {
    BackRest insertRetireService(Retirement retirement);
    BackRest selectRetireService(String number);
}
