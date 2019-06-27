package com.tcrush.service;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.employee.Employee;

public interface EmployeeService {
    BackRest insertEmployeeService(Employee employee);
    BackRest selectEmployeeService(String number);
    BackRest deleteEmployeeService(String number);
    BackRest upDateEmployeeService(String number, Employee employee);
}
