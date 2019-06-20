package com.tcrush.dao;

import com.tcrush.entity.employee.Employee;

public interface EmployeeDao {
    void InsertEmployee(Employee employee);
    Employee SelectEmployee(String number);
    void DeleteEmployee(String number);
    void UpDateEmployee(String number, Employee employee);
}
