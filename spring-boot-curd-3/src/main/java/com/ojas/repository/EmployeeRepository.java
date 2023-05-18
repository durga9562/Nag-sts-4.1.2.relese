package com.ojas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ojas.entity.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
