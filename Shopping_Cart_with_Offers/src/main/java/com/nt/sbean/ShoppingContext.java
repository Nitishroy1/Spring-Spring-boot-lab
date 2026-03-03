package com.nt.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ShoppingContext {
   ShoppingService service;
   
   @Autowired
   public ShoppingContext(ShoppingService service) {
	   this.service=service;
   }
}
