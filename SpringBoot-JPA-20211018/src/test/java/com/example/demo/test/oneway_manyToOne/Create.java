package com.example.demo.test.oneway_manyToOne;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.oneway_manyToOne.Customer;
import com.example.demo.entity.oneway_manyToOne.Order;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.OrderRepository;

@SpringBootTest
public class Create {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	OrderRepository orderRepository;
	
	@Test
	public void start() {
		System.out.println("test");
		Customer c1 = new Customer();
		c1.setName("John");
		c1.setAge(20);
		
		Order o1 = new Order();
		o1.setName("A-1");
		
		Order o2 = new Order();
		o2.setName("B-1");
		
		o1.setCustomer(c1);
		o2.setCustomer(c1);
		
		//執行單向多對一保存
		customerRepository.save(c1);
		orderRepository.save(o1);
		orderRepository.save(o2);
		
	}
}
