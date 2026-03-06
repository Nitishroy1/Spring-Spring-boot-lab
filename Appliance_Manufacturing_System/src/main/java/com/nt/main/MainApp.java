package com.nt.main;
import java .util.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.configer.AppConfig;
import com.nt.sbean.Appliance;
import com.nt.sbean.ApplianceFactory;
public class MainApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Enter appliance type (washingMachine / refrigerator): ");
		String type=sc.nextLine();
		ApplianceFactory bean = ctx.getBean(ApplianceFactory.class);
		Appliance appliance = bean.getAppliance(type);
		appliance.manufacture();
		
	}

}
