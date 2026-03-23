package com.nt.sbean;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Service 
@Profile("prod")
public class TruckService implements VehicleService {

	@Override
	public List<Vehicle> getVehicles() {
	
		return Arrays.asList(new Vehicle(101, "Tata Truck", "Desigle"),new Vehicle(102, "Ashok Leyland", "Desigle"));
	}

}
