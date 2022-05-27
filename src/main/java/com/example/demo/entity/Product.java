package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// entity class
@Entity
@Table(name = "product_table")
public class Product {

	@Id
	@GeneratedValue
	private int id;
	private String name;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
