package com.nt.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class NotificationServiceRunner implements CommandLineRunner {
   
	@Autowired
	NotificationService service;
	
	@Override
	public void run(String... args) throws Exception {
		 Notification notification=new Notification(1001, "Welcome to Spring Profile!", "Nitish");
		service.sendNotification(notification);
	}

}
