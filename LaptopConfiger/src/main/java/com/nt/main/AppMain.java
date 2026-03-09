package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.configure.AppConfiger;
import com.nt.sbean.LaptopService;

public class AppMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfiger.class);
		LaptopService lservice=ctx.getBean(LaptopService.class);
	    lservice.printLaptopDetails();
	}

}
