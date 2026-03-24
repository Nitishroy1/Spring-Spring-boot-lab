package com.nt.sbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Service 
@Profile("dev")
public class EmailDev implements EmailService { 
	@Value("${email.dev.sender}")
	private String Sender;
	@Override
	public void sendEmail(Email email) {
		System.out.println("Dev Email sent from "+ Sender);

	}

}
