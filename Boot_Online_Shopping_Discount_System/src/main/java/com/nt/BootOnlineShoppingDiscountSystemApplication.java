package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbean.Product;
import com.nt.sbean.ProductDisc;

@SpringBootApplication
public class BootOnlineShoppingDiscountSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(BootOnlineShoppingDiscountSystemApplication.class, args);
		ProductDisc p=ctx.getBean("disc",ProductDisc.class);
		System.out.println(p);
		
	}

}
