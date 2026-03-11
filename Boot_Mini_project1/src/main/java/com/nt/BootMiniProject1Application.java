package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.Manage_ViewData;
import com.nt.data.EmployeeBean;

import java.util.*;

@SpringBootApplication
public class BootMiniProject1Application {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext ctx = SpringApplication.run(BootMiniProject1Application.class, args);
		Scanner sc=new Scanner(System.in);
		Manage_ViewData bean = ctx.getBean("empController",Manage_ViewData.class);
		System.out.println("Enter First JOB Name: ");
		String desg1=sc.nextLine();
		System.out.println("Enter Second JOB Name: ");
		String desg2=sc.nextLine();
		System.out.println("Enter Therd JOB Name: ");
		String desg3=sc.nextLine();
		try {
			List<EmployeeBean> showAll_Emp = bean.showAllEmployeeByDesgs(desg1, desg2, desg3);
			showAll_Emp.forEach(emp->{
				System.out.println(emp);
			});
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
