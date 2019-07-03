package com.tcrush.dao;

import com.tcrush.entity.employee.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao {
    void insertEmployee(Employee employee);
    List<Employee> selectEmployee(String number);
    List<Employee> selectByName(String name);
    List<Employee> selectAll();
    void deleteEmployee(String number);
    void upDateEmployee(String number, Employee employee);
}
