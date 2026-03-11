package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.data.EmployeeBean;
@Repository("EmpDAO")
public class EmployeeDAO implements EmployeeDAOI {
	private static final String GET_EMPS_QUERY="SELECT EMPNO,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN(?,?,?)ORDER BY JOB";
    @Autowired
	private DataSource ds;
	@Override
	public List<EmployeeBean> getEmpByDesgs(String desg1, String desg2, String desg3) throws Exception {
		 List<EmployeeBean>list=new ArrayList<EmployeeBean>();
		try(Connection con=ds.getConnection();
			PreparedStatement pstmt=con.prepareStatement(GET_EMPS_QUERY)) {
			pstmt.setString(1, desg1);
			pstmt.setString(2, desg2);
			pstmt.setString(3, desg3);
			try(ResultSet rs = pstmt.executeQuery()) {
				while(rs.next()) {
					EmployeeBean eb=new EmployeeBean();
					eb.setEno(rs.getInt(1));
					eb.setJob(rs.getString(2));
					eb.setSalary(rs.getDouble(3));
					eb.setDeptno(rs.getInt(4));
					list.add(eb);
				}
			} 
			
		}
		catch(SQLException e) {
			e.printStackTrace(); 
			throw e;
		}
		catch (Exception e) {
			e.printStackTrace(); 
			throw e;
		}
		return list;
	}

}
