package com.nt.sbean;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;

import org.springframework.stereotype.Component;
@Component("amazon")
public class AmazonService implements ShoppingService {

	HashMap<String,Double>product=new HashMap<>();
	double totalPrice=0;
	double afterDiscountPrice=0;
	
	@Override
	public void addItem(String item, double price) {
		product.put(item,price);

	}

	@Override
	public void checkOut() {
		Collection<Double> values = product.values();
		
		for(Double v: values) {
			totalPrice+=v;
		}
		afterDiscountPrice=totalPrice-totalPrice*0.1;
		if(afterDiscountPrice>=500) {
			System.out.println("Your item Eligebal for free delivery: ");
			System.out.println("Your total Cart value:"+afterDiscountPrice);
			System.out.println("Product dliver withing the 3-5 days");
		}
		else {
			System.out.println("Your item Not Eligebal for free delivery: ");
			System.out.println("Your total Cart value:"+(afterDiscountPrice+50));
			System.out.println("Product dliver withing the 3-5 days");
		}

	}

	@Override
	public void viewCart() {
		for(Entry<String,Double>p:product.entrySet()) {
			System.out.print("Product Name: "+p.getKey()+" : ");
			System.out.print("Price "+p.getValue());
		}

	}
	
	

}
