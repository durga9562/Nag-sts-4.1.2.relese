package com.ojas.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ojas.entity.Employee;

@Service
public interface EmpService {
	public List<Employee> getAllEmployeeDetails();
	public Optional<Employee> getEmpById(int id);
	public Employee saveOrUpdate(Employee emp);
	
	public void delete(int id);
}
