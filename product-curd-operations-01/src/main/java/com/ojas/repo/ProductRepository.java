package com.ojas.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.entity.ProductEntity;
@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

}
