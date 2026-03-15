package com.nt;
import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nt.sbean.Season_Finder;

@SpringBootApplication
public class BootSeasonFinderApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ApplicationContext ctx=SpringApplication.run(BootSeasonFinderApplication.class, args);
		Season_Finder bean = ctx.getBean(Season_Finder.class);
		System.out.println("Enter month number (1–12):");
		int month=Integer.parseInt(sc.nextLine());
		String grtSeason = bean.grtSeason(month);
		System.out.println("Session is : "+grtSeason);
		
	}

}



