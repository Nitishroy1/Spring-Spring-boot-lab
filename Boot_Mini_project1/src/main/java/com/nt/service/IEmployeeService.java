package com.nt.service;

import java.util.List;

import com.nt.data.EmployeeBean;

public interface IEmployeeService {
   public List<EmployeeBean> fetchAllEmployeeByDesg(String desg1,String desg2,String desg3)throws Exception;
}
