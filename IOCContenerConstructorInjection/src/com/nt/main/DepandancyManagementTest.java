package com.nt.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbcn.ServiceCenter;

public class DepandancyManagementTest {
public static void main(String [] args) {
	ApplicationContext cxt=new ClassPathXmlApplicationContext("com/nt/config/ApplicationContext.xml");
	ServiceCenter sc =cxt.getBean("serviceCenter",ServiceCenter.class);
	sc.performService();
}
}