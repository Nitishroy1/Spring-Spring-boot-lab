package com.nt.sbean;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ApplianceFactory {
	@Autowired
	 private Map<String, Appliance> appliances;
	
	public Appliance getAppliance(String type) {
		Appliance appliance=appliances.get(type);
		if(appliance==null) {
			throw new IllegalArgumentException("Invalid Appliance Type: " + type);
		}
		return appliance;
	}

}
