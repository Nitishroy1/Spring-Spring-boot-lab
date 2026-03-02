package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("googlePayService")
public class GooglePayService implements PaymentService {

	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹"+amount+" using GooglePay");

	}

}
