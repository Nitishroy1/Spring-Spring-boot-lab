package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.appConfiger.AppConfig;
import com.nt.sbean.PaymentProcessor;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		PaymentProcessor bean = ctx.getBean(PaymentProcessor.class);
		bean.processPayment(2000);
		ctx.close();
	}

}
