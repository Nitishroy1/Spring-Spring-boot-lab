package com.configmain;

import java.nio.file.FileSystem;
import java.nio.file.WatchKey;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.blogic.Weekend;

public class WeekendManageMain {
	public static void main(String[] args) {
	FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/configer/applicationContext.xml");
	Weekend wk =ctx.getBean("wkd",Weekend.class);
	String string =wk.showweekDayMessage("nitish");
	System.out.println(string);

}
}