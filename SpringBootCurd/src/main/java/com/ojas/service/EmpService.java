package com.ojas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ojas.entity.EmployeeEntity;

@Service
public interface EmpService {

	 EmployeeEntity saveEmployee(EmployeeEntity employee);
	 List<EmployeeEntity>getEmployeeList();
	 public EmployeeEntity getEmpById(int eid);
	 public void delete(int eid);
	 public EmployeeEntity update( EmployeeEntity emp);
	
	 
	 

}
