package com.tcrush.service;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.retirement.Retirement;

public interface RetirementService {
    BackRest InsertRetireService(Retirement retirement);
    BackRest SelectRetireService(String number);
}
