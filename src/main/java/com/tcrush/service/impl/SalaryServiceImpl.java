package com.tcrush.service.impl;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.salary.Salary;
import com.tcrush.service.SalaryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService {
    @Override
    public BackRest InsertSalary(Salary salary) {
        return null;
    }

    @Override
    public List<Salary> SelectSalary(String number) {
        return null;
    }
}
