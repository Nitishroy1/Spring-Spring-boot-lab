package com.nt.sbean;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Service 
@Profile("test")
public class CarService implements VehicleService {

	@Override
	public List<Vehicle> getVehicles() {
		
		return Arrays.asList(new Vehicle(101,"BMW", "Petrol"),new Vehicle(102, "Toyta", "Desigle"));
	}

}
