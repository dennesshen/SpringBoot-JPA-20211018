package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.oneway_manyToOne.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
