package com.nt.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("disc")
@Data
public class ProductDisc {
	
	@Autowired
	Product product;
	
	@Value("#{product.p_price-(product.p_price*product.p_disc)/100}")
	private Double finalPrice;

	
}
