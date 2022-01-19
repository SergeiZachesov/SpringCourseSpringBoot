package com.zachesov.springboot.dao;


import com.zachesov.springboot.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

     List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
