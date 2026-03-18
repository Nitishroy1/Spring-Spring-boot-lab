package com.nt.sbean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("dept")
@Data

public class CompDeptData {
	
   private Integer deptId;
   private String deptName;
   @Override
   public String toString() {
	return "---- Department List ----\r\n"
			+ "\ndeptId   :" + deptId + "| deptName  :" + deptName;
   }
   
}
