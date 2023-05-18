package com.ojas.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.entity.Department;
@Repository
public interface DeportmentRepository extends JpaRepository<Department, Long> {


	Department findByDepartmentId(Long departmentId);

	
	
	



	

}
