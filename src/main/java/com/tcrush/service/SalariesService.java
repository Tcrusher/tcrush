package com.tcrush.service;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.salary.Salaries;

import java.util.List;

public interface SalariesService {
    BackRest InsertSalaries(Salaries salaries);
    List<Salaries> SelectSalaries(String number);
}
