package com.tcrush.service.impl;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.salary.Salaries;
import com.tcrush.service.SalariesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalariesServiceImpl implements SalariesService {
    @Override
    public BackRest InsertSalaries(Salaries salaries) {
        return null;
    }

    @Override
    public List<Salaries> SelectSalaries(String number) {
        return null;
    }
}
