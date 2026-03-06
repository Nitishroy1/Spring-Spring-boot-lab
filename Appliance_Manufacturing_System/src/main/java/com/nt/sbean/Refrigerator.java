package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("refrigerator")
public class Refrigerator implements Appliance {

	@Override
    public void manufacture() {
        System.out.println("Manufacturing Refrigerator with inverter technology.");
    }
}
