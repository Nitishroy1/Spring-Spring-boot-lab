package com.nt.dao;

import java.util.List;

import com.nt.data.EmployeeBean;

public interface EmployeeDAOI {
public List<EmployeeBean> getEmpByDesgs(String desg1,String desg2,String desg3) throws Exception;
}
