package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.EmployeeDAOI;
import com.nt.data.EmployeeBean;

@Service("empService")
public class EmployeeService implements IEmployeeService {
    @Autowired
	private EmployeeDAOI dao;
	@Override
	public List<EmployeeBean> fetchAllEmployeeByDesg(String desg1, String desg2, String desg3) throws Exception {
		List<EmployeeBean> empByDesgs = dao.getEmpByDesgs(desg1, desg2, desg3);
		empByDesgs.forEach(emp ->{
			emp.setGrossSalary(emp.getSalary()+emp.getSalary()*0.2);
			emp.setNetSalary(emp.getGrossSalary()-emp.getSalary());
		});
		return empByDesgs;
	}
   
}
