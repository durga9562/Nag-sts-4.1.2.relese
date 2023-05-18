package com.ojas.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ojas.exception.ResorceNotFoundException;
import com.ojas.model.Employee;
import com.ojas.repository.EmployeeRepository;
import com.ojas.services.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	public EmployeeServiceImpl(EmployeeRepository empRepo) {
		super();
		this.empRepo = empRepo;
	}


	private EmployeeRepository empRepo;
	

	@Override
	public Employee savemy(Employee employee) {
		
	//Employee e= empRepo.save(employee);
	

		return empRepo.save(employee);
	}


	@Override
	public List<Employee> getAllEmployee() {
		
		return empRepo.findAll();
	}


	@Override
	public Employee getEmployeeById(int id) {
		Optional<Employee> findempById = empRepo.findById(id);
		if(findempById.isPresent()) {
			return findempById.get();
		}else {
			throw new ResorceNotFoundException("Employee", "Id", id);
			
		}
	//another apporoach by using lambda
	//return empRepo.findById(id).orElseThrow(()->new ResorceNotFoundException("Employee", "id", id));
		
	}


	@Override
	public Employee updateEmployee(Employee employee, int id) {
		Employee ExistingEmp = empRepo.findById(id).orElseThrow(()->new ResorceNotFoundException("Employee", "Id", id));
		ExistingEmp.setFirstname(employee.getFirstname());
		ExistingEmp.setLastname(employee.getLastname());
		ExistingEmp.setEmail(employee.getEmail());
		//save exiting emp to DB
		empRepo.save(ExistingEmp);
		return ExistingEmp;
	}


	@Override
	@ExceptionHandler(value = ResorceNotFoundException.class)
	public void deleteById(int id) {
		
		empRepo.deleteById(id);
		
	}


	
	
}
