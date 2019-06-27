package com.tcrush.service;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.salary.Salary;

public interface SalaryService {
    BackRest InsertSalary(Salary salary);
    BackRest SelectSalary(String number);
}
