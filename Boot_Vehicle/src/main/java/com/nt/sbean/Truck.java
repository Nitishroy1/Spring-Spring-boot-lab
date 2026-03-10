package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("Truck")
public class Truck implements Vehicle {
	 private Engine engine;
	 private int dore;
	 
	public Truck(Engine engine, int dore) {
		super();
		this.engine = engine;
		this.dore = dore;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Car with " + engine.getEngineType() + " Engine and " + dore + " doors";
	}

}
