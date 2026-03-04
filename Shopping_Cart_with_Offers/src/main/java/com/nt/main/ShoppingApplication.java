package com.nt.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.appConfige.AppConfig;
import com.nt.sbean.ShoppingContext;
import com.nt.sbean.ShoppingService;

public class ShoppingApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Scanner sc = new Scanner(System.in);

        System.out.println("Choose Platform:");
        System.out.println("1. Amazon");
        System.out.println("2. Flipkart");

        int choice = sc.nextInt();
		 ShoppingService service = null;

	        if (choice == 1)
	            service = ctx.getBean("amazon", ShoppingService.class);
	        else
	            service = ctx.getBean("flipkart", ShoppingService.class);

	        ShoppingContext context = new ShoppingContext(service);

	        while (true) {

	            System.out.println("\n1.Add Item");
	            System.out.println("2.View Cart");
	            System.out.println("3.Checkout");
	            System.out.println("4.Exit");

	            int op = sc.nextInt();

	            switch (op) {

	                case 1:
	                    System.out.println("Enter Item:");
	                    String item = sc.next();

	                    System.out.println("Enter Price:");
	                    double price = sc.nextDouble();

	                    context.addItem(item, price);
	                    break;

	                case 2:
	                    context.viewCart();
	                    break;

	                case 3:
	                    context.checkout();
	                    break;

	                case 4:
	                    System.out.println("Thank you for shopping!");
	                    ctx.close();
	                    System.exit(0);
	            }
	        }

	}

}
