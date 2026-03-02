package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("paytmPaymentService")
public class PaytmPaymentService implements PaymentService {

	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹"+amount+" using Paytm ");
	}

}
