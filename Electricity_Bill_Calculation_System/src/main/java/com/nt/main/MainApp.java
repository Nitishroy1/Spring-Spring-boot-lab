package com.nt.main;
import java.util.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbean.BillingStrategy;
import com.nt.sbean.ElectricityBillingSystem;

public class MainApp {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Customer Type:(Industrial/Commercial/Residential): ");
	String custType=sc.nextLine();
	
	System.out.print("\nUnits Consumed: ");
	int unit=Integer.parseInt(sc.nextLine());
	System.out.print("\nRate per Unit: ");
	int rate=Integer.parseInt(sc.nextLine());
	
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	BillingStrategy bean = ctx.getBean(custType,BillingStrategy.class);
	ElectricityBillingSystem ebsystem=new ElectricityBillingSystem(bean);
	ebsystem.showBill(unit, rate);
	
}
}
