package com.ojas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ojas.entity.EmployeeEntity;
import com.ojas.model.Employee;
import com.ojas.repo.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmpService{
	@Autowired
	private EmployeeRepository emprepo;

	@Override
	public EmployeeEntity saveEmployee(EmployeeEntity employee) {
		// TODO Auto-generated method stub
		return emprepo.save(employee);
	}

	@Override
	public List<EmployeeEntity> getEmployeeList() {
		// TODO Auto-generated method stub
		return (List<EmployeeEntity>)emprepo.findAll();
	}

	@Override
	public EmployeeEntity getEmpById(int eid) {
		
		return emprepo.findById(eid).get();
	}

	@Override

	public void delete(int eid) {
		emprepo.deleteById(eid);
		
		
	}

	

	@Override
	public EmployeeEntity update(EmployeeEntity employee) {
		
		//Employee e=new Employee();
		
		return emprepo.save(employee);
	}



	
	
	
	}


