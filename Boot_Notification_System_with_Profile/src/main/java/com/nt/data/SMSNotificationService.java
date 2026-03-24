package com.nt.data;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service 
@Profile("test")
public class SMSNotificationService implements NotificationService {

	@Override
	public void sendNotification(Notification n) {
		// TODO Auto-generated method stub
       System.out.println("Sending SMS to "+n.getRecipient()+": "+n.getMessage());
	}

}
