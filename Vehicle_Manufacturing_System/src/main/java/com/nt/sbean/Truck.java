package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("truck")
public class Truck implements Vehicle {

	@Override
	public void assemble() {
		System.out.println("Assembling a Truck with heavy-duty engine..");
	}

}
