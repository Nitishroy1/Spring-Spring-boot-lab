package com.nt.sbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("product")
@Data
public class Product {
	@Value("${product.name}")
	private String p_name;
	@Value("${product.price}")
	private Double p_price;
	@Value("${product.discount.Percentage}")
	private Double p_disc;
	
	@Override
	public String toString() {
		return "Product [p_name=" + p_name + ", p_price=" + p_price + ", p_disc=" + p_disc + "]";
	}

}
