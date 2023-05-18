package com.ojas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.entity.Order;

public interface OrderRepo extends JpaRepository<Order, Integer> {

}
