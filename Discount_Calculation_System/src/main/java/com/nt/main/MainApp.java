package com.nt.main;
import java.util.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbean.BillingService;
import com.nt.sbean.DiscountStrategy;
import com.nt.sbean.RegularCustomerDiscount;
public class MainApp {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter purchase amount: ");
	double amount=Double.parseDouble(sc.nextLine());
	System.out.print("\nEnter customer type (regular/premium/elite):");
	String type=sc.nextLine();
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	DiscountStrategy bean = ctx.getBean(type,DiscountStrategy.class);
	BillingService bill=new BillingService(bean);
	bill.generateBill(amount);
	ctx.close();
	
	
	
	
}
}
