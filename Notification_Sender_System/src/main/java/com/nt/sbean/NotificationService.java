package com.nt.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service
public class NotificationService {
	@Autowired 
	@Qualifier("whatsAppService")
    MessageService messageService;
	
	public void notifyUser(String msg) {
		messageService.send(msg);
	}
}
