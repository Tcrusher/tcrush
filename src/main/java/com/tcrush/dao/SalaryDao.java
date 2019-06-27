package com.tcrush.dao;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.salary.Salary;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryDao {
    BackRest InsertSalary(Salary salary);
    BackRest SelectSalary(String number);
}
