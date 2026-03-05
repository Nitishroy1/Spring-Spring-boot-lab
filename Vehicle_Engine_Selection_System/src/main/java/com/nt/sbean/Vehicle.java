package com.nt.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service
public class Vehicle {
    @Autowired 
    @Qualifier("electricEngine")
	Engine engine;
    
    public void startVehicle() {
    	engine.start();
    }
}
