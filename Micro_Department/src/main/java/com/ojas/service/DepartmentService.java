package com.ojas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.ojas.entity.Department;

import com.ojas.repository.DeportmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	@Autowired
	private DeportmentRepository departmentRepo;


	public Department saveDepartment(Department department) {
	//	log.info("inside saveDepartment method Of DepartmentService");

		return departmentRepo.save(department);
	}

	public Department findByDepartmentId(Long departmentId) {
	//	log.info("inside findDeparmentById method Of DepartmentService");
		return departmentRepo.findById(departmentId).get();
	}

	

}
