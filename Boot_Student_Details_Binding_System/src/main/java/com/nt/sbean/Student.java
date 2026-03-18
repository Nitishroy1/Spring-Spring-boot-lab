package com.nt.sbean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component("student")
@ConfigurationProperties(prefix = "student")
@Data
public class Student {
	private Integer id;
	private String name;
	private String course;
	private Double fee;
	@Override
	public String toString() {
		return "-------Student Details ---------"
				+ "\nid    :" + id + "\nname   :" + name + "\ncourse   :" + course + "\nfee   :" + fee ;
	}
	

}
