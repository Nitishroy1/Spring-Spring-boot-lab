package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailService implements MessageService {

	@Override
	public void send(String message) {
		System.out.println("Email sent:"+message);
		
	}

}
