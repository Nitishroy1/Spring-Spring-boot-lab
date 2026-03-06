package com.nt.sbean;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleFactory {
      @Autowired
	 private Map<String,Vehicle>vehicles;
	  
	 public Vehicle getVehicle(String type) {
		 Vehicle vehicle = vehicles.get(type);
		 if(vehicle==null) {
			 throw new IllegalArgumentException("Wronge Vehicle Type..!!");
		 }
		 return vehicle;
	 }
}
