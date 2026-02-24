package com.nt.sbcn;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceCenter {
	@Autowired
   Vehicle vehicle;
   String serviceType;
   
   public void ServiceCenter() {
	  System.out.println("Full Engine Checkup Done !!!.."); 
   }
}
