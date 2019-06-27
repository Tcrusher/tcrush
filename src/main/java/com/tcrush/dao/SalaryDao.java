package com.tcrush.dao;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.salary.Salary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalaryDao {
    BackRest insertSalary(Salary salary);
    List<Salary> selectSalary(String number);
}
