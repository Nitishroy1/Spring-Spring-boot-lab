package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("regular")
public class RegularCustomerDiscount implements DiscountStrategy {

	@Override
	public double calaculateDiscount(double amount) {
		double disc_amount=amount*0.05;
		System.out.println("Discount Applied: ₹"+disc_amount);
		return amount-disc_amount;
	}

}
