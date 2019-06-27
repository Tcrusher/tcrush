package com.tcrush.service;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.salary.Salaries;

public interface SalariesService {
    BackRest InsertSalaries(Salaries salaries);
    BackRest selectSalaries(String number);
}
