package com.example.demo.test.oneway_OneToMany;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.example.demo.repository.InfectRepository;
import com.example.demo.repository.VaccineRepository;

@SpringBootTest
public class Remove {
	
	@Autowired
	VaccineRepository vaccineRepository;
	
	@Autowired
	InfectRepository infectRepository;
	
	@Test
	public void begin() {
		System.out.println("Remove");
		
		//預設刪除 -> 會update所關聯資料庫的外鍵鍵值
		//infectRepository.deleteById(1L);
		
		//聯集刪除 -> 要在entity當中設定 CascadeType
		infectRepository.deleteById(1L);

		
		
		
	}

}
