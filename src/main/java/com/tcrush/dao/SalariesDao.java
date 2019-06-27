package com.tcrush.dao;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.salary.Salaries;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalariesDao {
    BackRest insertSalaries(Salaries salaries);
    List<Salaries> selectSalaries(String number);
}
