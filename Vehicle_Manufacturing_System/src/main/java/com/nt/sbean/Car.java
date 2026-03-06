package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vehicle {

	@Override
	public void assemble() {
		System.out.println("Assembling a Car with automatic transmission.");

	}

}
