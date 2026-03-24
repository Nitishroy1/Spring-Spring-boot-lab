package com.nt.data;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service 
@Profile("prod")
public class PushNotificationService implements NotificationService {

	@Override
	public void sendNotification(Notification n) {
		// TODO Auto-generated method stub
     System.out.println("Sending Push Notification to "+n.getRecipient()+": "+n.getMessage());
	}

}
