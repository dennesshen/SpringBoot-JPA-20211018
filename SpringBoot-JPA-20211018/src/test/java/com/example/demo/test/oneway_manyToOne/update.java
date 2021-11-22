package com.example.demo.test.oneway_manyToOne;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.oneway_manyToOne.Customer;
import com.example.demo.entity.oneway_manyToOne.Order;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.OrderRepository;

@SpringBootTest
public class update {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	OrderRepository orderRepository;
	
	@Test
	public void start() {
		
		//假設要修改訂單名稱跟客戶年齡
		Order order = orderRepository.findById(1L).get();
		Customer customer = order.getCustomer();
		order.setName("AA-11");
		customer.setAge(30);
		
		//進行資料保存
		//orderRepository.save(order);
		//customerRepository.save(customer);	
		
		//進行聯集保存
		//在＠ManyToOne當中加入cascade = CascadeType.Merge
		orderRepository.save(order);
		
		
		
	}
}
