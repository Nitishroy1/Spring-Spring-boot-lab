package com.nt;
import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbean.NumberService;

@SpringBootApplication
public class BootEvenOddApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootEvenOddApplication.class, args);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=Integer.parseInt(sc.nextLine());
		NumberService bean = ctx.getBean(NumberService.class);
		String checkEvenOdd = bean.checkEvenOdd(num);
		System.out.println(num+" is "+checkEvenOdd);
	}

}
