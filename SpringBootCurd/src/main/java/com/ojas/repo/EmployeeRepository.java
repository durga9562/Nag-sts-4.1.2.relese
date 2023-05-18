package com.ojas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

}
