package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SmsService implements MessageService {

	@Override
	public void send(String message) {
		System.out.println("SMS sent:"+message);

	}

}
