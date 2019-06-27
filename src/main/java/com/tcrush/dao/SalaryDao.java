package com.tcrush.dao;

import com.tcrush.entity.salary.Salary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalaryDao {
    void insertSalary(Salary salary);
    List<Salary> selectSalary(String number);
}
