package com.ojas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.entity.EmployeeEntity;
import com.ojas.service.EmpService;
@RestController
public class EmployeeController {
	@Autowired
	private EmpService empservice;
	
	@PostMapping("/employee")
	public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employee) {
		return empservice.saveEmployee(employee);
		
	}
	@GetMapping("/employee")
	public List<EmployeeEntity> getAllEmp(EmployeeEntity employee){
		return empservice.getEmployeeList();
		
	}
	@GetMapping("/employee/{eid}")
	public EmployeeEntity getEmpById(@PathVariable("eid") int eid) {
		
		return empservice.getEmpById(eid);
	}
	@DeleteMapping("/employee/{eid}")
	public void delete(@PathVariable("eid") int eid) {
		empservice.delete(eid);
	}
	@PostMapping("/employeeupdate")
	public EmployeeEntity update(@RequestBody EmployeeEntity emp) {
		return empservice.update(emp);
	}
	
}
