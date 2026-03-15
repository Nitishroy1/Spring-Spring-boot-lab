package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component
public class Season_Finder {
	String season;
   public String grtSeason(int month) {
	   if(month >= 3 && month <= 5) {
		    season = "Spring";
		}
		else if(month >= 6 && month <= 9) {
		    season = "Rainy";
		}
		else if(month >= 10 && month <= 11) {
		    season = "Autumn";
		}
		else if(month == 12 || month == 1 || month == 2) {
		    season = "Winter";
		}
	 return season;  
   }
}
