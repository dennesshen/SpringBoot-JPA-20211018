package com.example.demo.test.oneway_manyToOne;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.oneway_manyToOne.Customer;
import com.example.demo.entity.oneway_manyToOne.Order;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.OrderRepository;

@SpringBootTest
public class Query {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	OrderRepository orderRepository;
	
	@Test
	public void start() {
		
		Order order = orderRepository.findById(1L).get();
		System.out.println(order.getName());
		
		System.out.println(order.getCustomer().getName());
		
	}
}
