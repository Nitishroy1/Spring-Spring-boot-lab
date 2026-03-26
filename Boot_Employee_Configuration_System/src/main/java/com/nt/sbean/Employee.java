package com.nt.sbean;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


import lombok.Data;
@Component
@Data 
@ConfigurationProperties(prefix = "employee")
public class Employee {
 private int id;
 private String name;
 private double salary;
 private String[] skills;
 private List<String> project;
 private Set<String> tools;
 private Map<String,Integer> experience;
 @Autowired
 Address address;
}
