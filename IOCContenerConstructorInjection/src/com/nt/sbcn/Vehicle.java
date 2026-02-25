package com.nt.sbcn;

import org.springframework.beans.factory.annotation.Autowired;

public class Vehicle {
	String vehicleName;
	Engine engine;
	Tyre tyre;
	
	public Vehicle(Engine engine ) {
		this.engine=engine;
	}
	
	public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

	@Autowired
	public void setTyre(Tyre tyre) {
		this.tyre=tyre;
	}
	
	public void displayVehicleInfo() {
		System.out.println("Vehical Name is: "+this.vehicleName);
		engine.showEngineDetails();
		tyre.showTyreDetails(); 
		
		
      		
	}

}
