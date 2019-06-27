package com.tcrush.service.impl;

import com.tcrush.dao.SalariesDao;
import com.tcrush.entity.BackRest;
import com.tcrush.entity.salary.Salaries;
import com.tcrush.service.SalariesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalariesServiceImpl implements SalariesService {

    @Autowired
    SalariesDao salariesDao;

    BackRest backRest = new BackRest();

    @Override
    public BackRest insertSalaries(Salaries salaries) {
        try {
            salariesDao.insertSalaries(salaries);
            backRest.setCode(200);
            backRest.setMassage("增添历史工资信息成功");
            backRest.setData(null);
        } catch (Exception e) {
            e.printStackTrace();
            backRest.setCode(-1);
            backRest.setMassage("增添历史工资信息失败");
            backRest.setData(null);
        }
        return backRest;
    }

    @Override
    public BackRest selectSalaries(String number) {
        try {
            List<Salaries> salariesList = salariesDao.selectSalaries(number);
            backRest.setCode(200);
            backRest.setMassage("查询历史工资信息成功");
            backRest.setData(salariesList);
        } catch (Exception e) {
            e.printStackTrace();
            backRest.setCode(-1);
            backRest.setMassage("查询历史工资信息失败");
            backRest.setData(null);
        }
        return backRest;
    }
}
