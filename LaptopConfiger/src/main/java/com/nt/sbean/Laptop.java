package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	private String brand;
	private String processor;
	private String ram;
  public Laptop() {
	  this.brand="Hp";
	  this.processor="intel Core i5";
	  this.ram="16GB";
  }
  public String getBrand() {
	return brand;
  }
  public String getProcessor() {
	return processor;
  }
  public String getRam() {
	return ram;
  }
  
}
