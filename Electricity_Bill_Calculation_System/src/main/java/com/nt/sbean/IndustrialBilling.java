package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("Industrial")
public class IndustrialBilling implements BillingStrategy {

	@Override
	public double calculateBill(double units,int rate) {
		double totalbill=units*rate;
		return totalbill;
	}

}
