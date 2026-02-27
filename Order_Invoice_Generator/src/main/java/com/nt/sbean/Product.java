package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component
public class Product {
  private String name;
  private double price;
  private int quentity;
  public Product() {
	this.name="Laptop";
	this.price=50000d;
	this.quentity=2;
}
  public String getName() {
	return name;
  }
  public double getPrice() {
	return price;
  }
  public int getQuentity() {
	return quentity;
  }
  
}
