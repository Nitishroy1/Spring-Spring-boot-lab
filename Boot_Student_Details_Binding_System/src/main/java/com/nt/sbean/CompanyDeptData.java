package com.nt.sbean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component("listofdept")
@ConfigurationProperties(prefix = "dept")
@Data
public class CompanyDeptData {
	@Autowired
  List<CompDeptData> deptdata;
	
}
