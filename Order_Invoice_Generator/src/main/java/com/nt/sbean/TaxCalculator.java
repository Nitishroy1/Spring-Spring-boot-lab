package com.nt.sbean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class TaxCalculator {
 
	public double calculateTax(double amount) {
		double text=amount-amount*0.18;
		return text;
	}
}
