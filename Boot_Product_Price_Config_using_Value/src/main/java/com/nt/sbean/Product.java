package com.nt.sbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@SuppressWarnings("unused")
@Component("pro")
public class Product {
	@Value("${product.name}")
  String pro_name;
	@Value("${product.price}")
   double pro_price;
	@Value("${product.discount}")
  double pro_disc;
	
  double final_price=(pro_price)-(pro_price*0.1);
	@Override
	public String toString() {
		return "Product [pro_name=" + pro_name + ", pro_price=" + pro_price + ", pro_disc=" + pro_disc
				+ ", final_price=" + 1800 + "]";
	}
	
	
}
