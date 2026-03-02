package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.AppConfig.AppConfig;
import com.nt.sbean.NotificationService;

public class MainApp {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	NotificationService bean = ctx.getBean(NotificationService.class);
	bean.notifyUser("Hello Nitish How Are You!..");
	ctx.close();
}
}
