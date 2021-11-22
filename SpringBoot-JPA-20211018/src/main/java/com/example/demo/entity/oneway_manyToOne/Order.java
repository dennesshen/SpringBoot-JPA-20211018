package com.example.demo.entity.oneway_manyToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


//多方
@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 50, nullable = false)
	private String name;
	
	//單向多對一
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	//CascadeType.Merge代表修改時會自動去修改聯集資料的修改
	//fetch 預設是 EAGER -> 會查詢所有關聯的資料
	//fetch 使用   LAZY  -> 再不要求關聯資料的時候不會主動查詢，除非後來程式有特別調用
	//customer_id -> 外鍵（預設是有約束性的）
	@JoinColumn(name = "customer_id")
	private Customer customer;

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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
}
