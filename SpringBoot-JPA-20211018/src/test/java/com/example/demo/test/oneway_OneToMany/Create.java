package com.example.demo.test.oneway_OneToMany;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.oneway_OneToMany.Infect;
import com.example.demo.entity.oneway_OneToMany.Vaccine;
import com.example.demo.repository.InfectRepository;
import com.example.demo.repository.VaccineRepository;

@SpringBootTest
public class Create {
	
	@Autowired
	VaccineRepository vaccineRepository;
	
	@Autowired
	InfectRepository infectRepository;
	
	@Test
	public void begin() {
		System.out.println("Create");
		
		Infect infect = new Infect();
		infect.setName("COVID-19");
		
		Vaccine v1 = new Vaccine();
		v1.setName("AZ");
		v1.setCount(2);
		
		Vaccine v2 = new Vaccine();
		v2.setName("BNT");
		v2.setCount(2);
		
		Vaccine v3 = new Vaccine();
		v3.setName("PJ");
		v3.setCount(1);
		
		
		//設置關聯關係
		infect.getVaccines().add(v1);
		infect.getVaccines().add(v2);
		infect.getVaccines().add(v3);
		
		//執行保存
		//vaccineRepository.save(v1);
		//vaccineRepository.save(v2);
		//vaccineRepository.save(v3);
		//infectRepository.save(infect);
		
		
		//執行保存-單向一對多聯集保存
		infectRepository.save(infect);
		
		
		
		
		
		
		
	}

}
