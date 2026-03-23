package com.nt.sbean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class VehicleRunner implements CommandLineRunner {
    @Autowired 
	VehicleService service;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Vehicle> vehicles = service.getVehicles();
		System.out.println("Vehicles List:");
		for(Vehicle v: vehicles) {
			System.out.println("ID: "+v.getId()+
					",Name: "+v.getName()+", Type: "+v.getType());
		}

	}

}
