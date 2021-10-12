package com.example.meenaSQLExp.meenaSQLExp.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "one")
public class myModel {
	@Override
	public String toString() {
		return "myModel [id=" + id + ", name=" + name + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
