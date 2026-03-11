package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.data.EmployeeBean;
import com.nt.service.IEmployeeService;

@Controller("empController")
public class Manage_ViewData {
     @Autowired
	private IEmployeeService emp_Service;
    public List<EmployeeBean> showAllEmployeeByDesgs(String desg1,String desg2,String desg3)throws Exception{
    	List<EmployeeBean> fetchEmp = emp_Service.fetchAllEmployeeByDesg(desg1, desg2, desg3);
    	
    	return fetchEmp;
    }
}
