package com.ojas.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.entity.Employee;
import com.ojas.service.EmpServiceImpl;


@Controller
public class EmployeeController {
	@Autowired
	private EmpServiceImpl empservice;
	@GetMapping("/employee")
	
	public List<Employee> getAllEmployees(){
		return empservice.getAllEmployeeDetails();
		
	}
	@PostMapping("/employee/{id}")
	private Optional<Employee> getEmployee(@PathVariable("id") int id) {
		return empservice.getEmpById(id);
		
	}
	@PostMapping("/saveEmp")
	private Employee saveEmployee(@RequestBody Employee emp) {
		return empservice.saveOrUpdate(emp);
		
	}
	@DeleteMapping("/employee/{id}")
	private void delete(@PathVariable("id") int id) {
		empservice.delete(id);;
		
	}

	}
	
	


