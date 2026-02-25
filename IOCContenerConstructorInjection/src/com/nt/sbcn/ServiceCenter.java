package com.nt.sbcn;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceCenter {
	@Autowired
   Vehicle vehicle;
   String serviceType;
   
   public void setServiceType(String serviceType) {
       this.serviceType = serviceType;
   }

   public void performService() {
       System.out.println("\n--- Service Center ---");
       System.out.println("Service Type: " + serviceType);
       vehicle.displayVehicleInfo();
   }
}
