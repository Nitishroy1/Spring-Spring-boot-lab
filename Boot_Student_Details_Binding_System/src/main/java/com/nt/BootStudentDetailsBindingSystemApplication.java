package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbean.CompanyDeptData;
import com.nt.sbean.Student;

@SpringBootApplication
public class BootStudentDetailsBindingSystemApplication {

	public static void main(String[] args) {
	  ConfigurableApplicationContext ctx=SpringApplication.run(BootStudentDetailsBindingSystemApplication.class, args);
	  Student s =ctx.getBean("student",Student.class);
	  System.out.println(s);
	  CompanyDeptData bean = ctx.getBean("listofdept",CompanyDeptData.class);
	  System.out.println(bean);
	}

}
