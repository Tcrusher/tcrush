package com.tcrush.service;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.salary.Salary;

import java.util.List;

public interface SalaryService {
    BackRest InsertSalary(Salary salary);
    List<Salary> SelectSalary(String number);
}
