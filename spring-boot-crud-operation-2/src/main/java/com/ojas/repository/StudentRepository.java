package com.ojas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ojas.model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
