package com.ojas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
