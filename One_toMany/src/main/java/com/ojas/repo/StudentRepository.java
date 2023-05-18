package com.ojas.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.entity.StudentEntity;
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
