package com.nt.sbean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import lombok.Data;

@ConfigurationProperties(prefix = "add") 
@Data 
@Component("add")
public class Address {
  private String city;
  private String state;
  private String pincode;
}
