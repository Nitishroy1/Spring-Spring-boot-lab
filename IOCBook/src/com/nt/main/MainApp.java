package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbscn.Librarian;

public class MainApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/configer/ApplicationContext.xml");
		 Librarian bean = ctx.getBean("librarian",Librarian.class);
		 bean.manageLibrary();
	}
}
