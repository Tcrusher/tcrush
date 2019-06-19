package com.tcrush.service.impl;

import com.tcrush.dao.EmployeeDao;
import com.tcrush.entity.BackRest;
import com.tcrush.entity.employee.Employee;
import com.tcrush.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    BackRest backRest=new BackRest();
    @Override
    public BackRest InsertEmployeeService(Employee employee) {
        try {
            employeeDao.InsertEmployee(employee);
            backRest.setCode(200);
            backRest.setMassage("增添员工成功");
        } catch (Exception e) {
            e.printStackTrace();
            backRest.setCode(-1);
            backRest.setMassage("增添员工失败");
            return backRest;
        }
        return backRest;
    }

    @Override
    public BackRest SelectEmployeeService(String number) {
        return null;
    }

    @Override
    public BackRest DeleteEmployeeService(String number) {
        try {
            employeeDao.DeleteEmployee(number);
            backRest.setCode(200);
            backRest.setMassage("删除员工成功");
        } catch (Exception e) {
            e.printStackTrace();
            backRest.setCode(-1);
            backRest.setMassage("删除员工失败");
            return backRest;
        }

        return backRest;
    }

    @Override
    public BackRest UpDateEmployeeService(String number) {
        return null;
    }
}