package com.nt.sbean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Service 
@Profile("dev")
public class BikeService implements VehicleService {

	@Override
	public List<Vehicle> getVehicles() {
		
		 
		return Arrays.asList(new Vehicle(101,"Hero","Bick"),new Vehicle(102, "Pulsor", "Bick"),new Vehicle(103, "BMW", "Bick"));
	}

}
