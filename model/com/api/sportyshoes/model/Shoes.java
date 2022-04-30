package com.api.sportyshoes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Shoes {
	public Shoes(int id, String name, String category, double price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String category;
	private double price;
	public int getId1() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}


}