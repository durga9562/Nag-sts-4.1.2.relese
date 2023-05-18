package com.ojas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.entity.Employee;
import com.ojas.repository.EmployeeRepository;
@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	public EmployeeRepository emprepo;
	@Override
	public List<Employee> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> getEmpById(int id) {
	
		return emprepo.findById(id);
	}

	@Override
	public Employee saveOrUpdate(Employee emp) {
		
		return emprepo.save(emp);
	}

	@Override
	public void delete(int id) {
		emprepo.deleteById(id);

	}

}
