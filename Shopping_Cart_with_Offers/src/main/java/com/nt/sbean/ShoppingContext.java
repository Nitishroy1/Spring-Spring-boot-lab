package com.nt.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service
public class ShoppingContext {
   ShoppingService service;
   
   @Autowired
   public ShoppingContext(@Qualifier("amazon") ShoppingService service) {
	   this.service=service;
   }
   
   public void addItem(String item, double price) {
       service.addItem(item, price);
   }

   public void viewCart() {
       service.viewCart();
   }

   public void checkout() {
       service.checkOut();
   }
}
