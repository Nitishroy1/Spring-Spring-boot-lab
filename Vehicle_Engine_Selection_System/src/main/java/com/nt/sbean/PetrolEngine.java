package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("petroleEngine")
public class PetrolEngine implements Engine {

	@Override
	public void start() {
		System.out.println("Petrol engine started 🚗");

	}

}
