package com.example.demo.entity.twoway.ManyToOne;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "menu_items")
public class MenuItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 50, nullable = true)
	private String name;
	
	@Column
	private Integer price; 
	
	//雙向多對一
	@ManyToOne
	@JoinColumn(name = "group_id" )
	private MenuGroup menuGroups;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public MenuGroup getMenuGroups() {
		return menuGroups;
	}

	public void setMenuGroups(MenuGroup menuGroups) {
		this.menuGroups = menuGroups;
	}
	
	
	
	
	

}
