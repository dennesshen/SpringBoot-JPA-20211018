package com.example.demo.test.twoway_ManyToOne;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.example.demo.entity.twoway.ManyToOne.MenuGroup;
import com.example.demo.entity.twoway.ManyToOne.MenuItem;
import com.example.demo.repository.MenuGroupRepository;
import com.example.demo.repository.MenuItemRepository;

@SpringBootTest
public class Create {
	
	@Autowired
	MenuGroupRepository menuGroupRepository;

	@Autowired
	MenuItemRepository menuItemRepository;
	
	@Test
	public void begin() {
		System.out.println("Create");
		MenuGroup menuGroup1 = new MenuGroup();
		menuGroup1.setName("Food");
		
		MenuItem menuItem1 = new MenuItem();
		menuItem1.setName("Sandwich");
		menuItem1.setPrice(100);
		
		MenuItem menuItem2 = new MenuItem();
		menuItem2.setName("Hamburger");
		menuItem2.setPrice(50);
		
		//設置關聯關係
		menuGroup1.getMenuItems().add(menuItem1);
		menuGroup1.getMenuItems().add(menuItem2);
		menuItem1.setMenuGroups(menuGroup1);
		menuItem2.setMenuGroups(menuGroup1);
		
		//執行預設保存
		/*
		menuGroupRepository.save(menuGroup1);
		menuItemRepository.save(menuItem1);
		menuItemRepository.save(menuItem2);
	    */
		
		//關聯保存
		menuGroupRepository.save(menuGroup1);
		
	}

}
