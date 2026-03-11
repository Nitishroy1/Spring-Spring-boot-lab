package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component 
public class NumberService {
	String num;
	public String checkEvenOdd(int number) {
		if(number%2==0) {
			num="Even";
		}
		else {
			num="Odd";
		}
		return num;
	}

}
