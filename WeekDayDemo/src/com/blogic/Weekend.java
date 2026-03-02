package com.blogic;


import java.time.LocalDate;

public class Weekend {
	
	public LocalDate date;
	
	
	public void setDate(LocalDate date) {
		
		 this.date=date;
	}
	
	public String showweekDayMessage(String user) {
		
		System.out.println("Weekday Message ");
		int day=Integer.parseInt(String.valueOf(date.getDayOfWeek()));
		if(day>5) {
			return " Today is weekend or a weekday."+user;
		}
		else {
			return " Today is Not a weekend or a weekday."+user;
		}
	}

}
