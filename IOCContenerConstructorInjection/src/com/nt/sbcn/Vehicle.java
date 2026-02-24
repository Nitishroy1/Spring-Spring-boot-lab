package com.nt.sbcn;

import org.springframework.beans.factory.annotation.Autowired;

public class Vehicle {
	String vehicleName;
	Engine engine;
	Tyre tyre;
	
	public Vehicle(Engine engine ) {
		this.engine=engine;
	}
	@Autowired
	public void setTyre(Tyre tyre) {
		this.tyre=tyre;
	}
	
	public void displayVehicleInfo() {
		System.out.println("Vehical Name is: "+this.vehicleName);
		System.out.println("Vehical Engine Type is: "+engine.engineType);
		System.out.println("Vehical Engine Hourse Power  is: "+engine.horsePower);
		System.out.println("Vehical Tyre info  is: "+ tyre.brand);
		System.out.println("Vehical Tyre info  is: "+ tyre.size);
		
      		
	}

}
