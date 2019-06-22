package com.tcrush.dao;

import com.tcrush.entity.employee.Employee;

import java.util.List;

public interface EmployeeDao {
    void InsertEmployee(Employee employee);
    List<Employee> SelectEmployee(String number);
    void DeleteEmployee(String number);
    void UpDateEmployee(String number, Employee employee);
}
