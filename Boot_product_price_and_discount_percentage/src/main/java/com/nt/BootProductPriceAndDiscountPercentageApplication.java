package com.nt;
import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbean.DiscountService;

@SpringBootApplication
public class BootProductPriceAndDiscountPercentageApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProductPriceAndDiscountPercentageApplication.class, args);
		DiscountService bean = ctx.getBean(DiscountService.class);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter original price:");
		double orgPrice=Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter discount percentage:");
		double disc=Double.parseDouble(sc.nextLine());
		double applyDiscount = bean.applyDiscount(orgPrice, disc);
		System.out.println("Final price after discount: "+applyDiscount);
		
		
	}

}
