package com.ojas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
