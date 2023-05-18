package com.ojas.controller;


import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.ojas.model.Employee;

import com.ojas.services.impl.EmployeeServiceImpl;

@RestController

public class EmployeeController {

private EmployeeServiceImpl empserviceImpl;




public EmployeeController(EmployeeServiceImpl empserviceImpl) {
	super();
	this.empserviceImpl = empserviceImpl;
}




@PostMapping("/save")
public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
	System.out.println("hello");
	return new ResponseEntity<Employee>(empserviceImpl.savemy(employee), HttpStatus.CREATED);
	
}
@GetMapping("/emps")
public List<Employee> getAllEmployees(){
	return empserviceImpl.getAllEmployee();
	
}
@GetMapping("/empById/{id}")
public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int empId){
	return new ResponseEntity<Employee>(empserviceImpl.getEmployeeById(empId),HttpStatus.OK);
	
}
@PutMapping("/update/{id}")
public ResponseEntity<Employee> updateEmployee(@PathVariable("id") int id,@RequestBody Employee employee){
	
	return new ResponseEntity<Employee>(empserviceImpl.updateEmployee(employee, id),HttpStatus.OK);
	
}
@DeleteMapping("/delete/{id}")

public ResponseEntity<String> deleteEmployee(@PathVariable("id") int id){
	empserviceImpl.deleteById(id);
	return new ResponseEntity<String>("Employee details succesfuly deleted",HttpStatus.OK);
	
}
}
