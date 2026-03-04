package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("premium")
public class PremiumCustomerDiscount implements DiscountStrategy {

	@Override
	public double calaculateDiscount(double amount) {
		double disc_amount=amount*0.1;
		System.out.println("Discount Applied: ₹"+disc_amount);
		return amount-disc_amount;
	}

}
