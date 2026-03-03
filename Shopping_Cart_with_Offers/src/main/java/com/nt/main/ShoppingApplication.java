package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.appConfige.AppConfig;
import com.nt.sbean.ShoppingContext;

public class ShoppingApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		ctx.getBean(ShoppingContext.class);

	}

}
