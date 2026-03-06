package com.nt.main;
import java.util.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbean.Vehicle;
import com.nt.sbean.VehicleFactory;
public class MainApp {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	System.out.println("Inter your type(car, truck, bike): " );
	String type=sc.nextLine();
	VehicleFactory bean = ctx.getBean(VehicleFactory.class);
	Vehicle vehicle = bean.getVehicle(type);
	vehicle.assemble();
	
}
}
