package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.AppConfig.AppConfig;
import com.nt.sbean.Vehicle;

public class MainApp {
  public static void main(String[] args) {
	  AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	  Vehicle bean = ctx.getBean(Vehicle.class);
	  bean.startVehicle();
	  ctx.close();
  }
}
