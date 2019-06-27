package com.tcrush.dao;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.salary.Salaries;
import org.springframework.stereotype.Repository;

@Repository
public interface SalariesDao {
    BackRest InsertSalaries(Salaries salaries);
    BackRest SelectSalaries(String number);
}
