package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements Vehicle {

	@Override
	public void assemble() {
		System.out.println("Assembling a Bike with lightweight alloy frame.");

	}

}
