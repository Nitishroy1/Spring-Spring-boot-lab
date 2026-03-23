package com.nt.sbean;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

@Getter 
@Setter 

public class Vehicle {
	private Integer id;
	private String name;
	private String type;
	public Vehicle(Integer id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}
	
	

}
