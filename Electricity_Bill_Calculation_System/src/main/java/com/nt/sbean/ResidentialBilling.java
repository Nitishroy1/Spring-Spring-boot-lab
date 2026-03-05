package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("Residential")
public class ResidentialBilling implements BillingStrategy {

	@Override
	public double calculateBill(double units,int rate) {
		double totalbill=units*rate;
		return totalbill;
	}

}
