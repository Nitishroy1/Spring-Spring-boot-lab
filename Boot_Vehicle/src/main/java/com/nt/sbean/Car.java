package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vehicle {
    private Engine engine;
    private int dore;
     
    
	public Car(Engine engine, int dore) {
		super();
		this.engine = engine;
		this.dore = dore;
	}


	@Override
	public String getDescription() {
		
	 return "Car with " + engine.getEngineType() + " Engine and " + dore + " doors";
	}

}
