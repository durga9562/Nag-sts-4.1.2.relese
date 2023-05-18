package com.ojas.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.entity.CourceEntity;
@Repository
public interface CourceRepository extends JpaRepository<CourceEntity, Integer> {

}
