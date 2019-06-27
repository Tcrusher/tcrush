package com.tcrush.service.impl;

import com.tcrush.dao.SalaryDao;
import com.tcrush.entity.BackRest;
import com.tcrush.entity.salary.Salary;
import com.tcrush.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService {

    @Autowired
    SalaryDao salaryDao;

    BackRest backRest = new BackRest();

    @Override
    public BackRest insertSalary(Salary salary) {
        try {
            salaryDao.insertSalary(salary);
            backRest.setCode(200);
            backRest.setMassage("增添薪资信息成功");
            backRest.setData(null);
        } catch (Exception e) {
            e.printStackTrace();
            backRest.setCode(-1);
            backRest.setMassage("增添薪资薪资失败");
            backRest.setData(null);
        }
        return backRest;
    }

    @Override
    public BackRest selectSalary(String number) {
        try {
            List<Salary> salaryList = salaryDao.selectSalary(number);
            backRest.setCode(200);
            backRest.setMassage("查询薪资信息成功");
            backRest.setData(salaryList);
        } catch (Exception e) {
            e.printStackTrace();
            backRest.setCode(-1);
            backRest.setMassage("查询薪资信息失败");
            backRest.setData(null);
        }
        return backRest;
    }
}
