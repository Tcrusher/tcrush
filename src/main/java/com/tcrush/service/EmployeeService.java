package com.tcrush.service;

import com.tcrush.entity.BackRest;
import com.tcrush.entity.employee.Employee;

public interface EmployeeService {
    BackRest InsertEmployeeService(Employee employee);
    BackRest SelectEmployeeService(String number);
    BackRest DeleteEmployeeService(String number);
    BackRest UpDateEmployeeService(String number);
}
