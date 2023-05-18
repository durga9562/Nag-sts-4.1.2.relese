package com.ojas.services;

import java.util.List;


import com.ojas.model.Employee;

public interface EmployeeService {
Employee savemy(Employee employee);
List<Employee> getAllEmployee();
Employee getEmployeeById(int id);
Employee updateEmployee(Employee employee,int id);
void deleteById(int id);
}
