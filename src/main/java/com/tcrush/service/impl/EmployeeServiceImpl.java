package com.tcrush.service.impl;

import com.tcrush.dao.EmployeeDao;
import com.tcrush.entity.BackRest;
import com.tcrush.entity.employee.Employee;
import com.tcrush.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    BackRest backRest = new BackRest();

    @Override
    public BackRest insertEmployeeService(Employee employee) {
        try {
            employeeDao.insertEmployee(employee);
            backRest.setCode(200);
            backRest.setMassage("增添员工成功");
            backRest.setData(null);
        } catch (Exception e) {
            e.printStackTrace();
            backRest.setCode(-1);
            backRest.setMassage("增添员工失败");
            backRest.setData(null);
            return backRest;
        }
        return backRest;
    }

    @Override
    public BackRest selectEmployeeService(String number) {
        try {
            List<Employee> employees = employeeDao.selectEmployee(number);
            backRest.setCode(200);
            backRest.setMassage("查询员工成功");
            backRest.setData(employees);
        } catch (Exception e) {
            e.printStackTrace();
            backRest.setCode(-1);
            backRest.setMassage("查询员工失败");
            backRest.setData(null);
        }
        return backRest;
    }

    @Override
    public BackRest deleteEmployeeService(String number) {
        try {
            employeeDao.deleteEmployee(number);
            backRest.setCode(200);
            backRest.setMassage("删除员工成功");
            backRest.setData(null);
        } catch (Exception e) {
            e.printStackTrace();
            backRest.setCode(-1);
            backRest.setMassage("删除员工失败");
            backRest.setData(null);
            return backRest;
        }

        return backRest;
    }

    @Override
    public BackRest upDateEmployeeService(String number, Employee employee) {
        try {
            employeeDao.upDateEmployee(number, employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}