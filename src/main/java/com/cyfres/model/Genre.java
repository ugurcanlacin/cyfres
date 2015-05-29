package com.cyfres.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "genre", catalog = "cyfres")
public class Genre {
	private Integer id;
	private String name;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return id;
	}
	
	public void setId(Integer id) {
		if (id > 0) 
			this.id = id;
		else
			throw new IllegalArgumentException();
	}
	
	@Column(name = "name", length = 255)
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
