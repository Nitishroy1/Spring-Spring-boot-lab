package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbean.Product;

@SpringBootApplication
public class BootProductPriceConfigUsingValueApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(BootProductPriceConfigUsingValueApplication.class, args);
		Product bean = ctx.getBean("pro",Product.class);
		System.out.println(bean);
	}

}
