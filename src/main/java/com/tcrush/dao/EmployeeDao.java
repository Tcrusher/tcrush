package com.tcrush.dao;

import com.tcrush.entity.employee.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao {
    void InsertEmployee(Employee employee);
    List<Employee> SelectEmployee(String number);
    void DeleteEmployee(String number);
    void UpDateEmployee(String number, Employee employee);
}
