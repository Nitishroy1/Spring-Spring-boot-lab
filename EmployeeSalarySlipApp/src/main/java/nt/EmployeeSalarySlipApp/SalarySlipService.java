package nt.EmployeeSalarySlipApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalarySlipService {
	@Autowired 
	Employee employee;
	
	
//method
	public void generateSlip() {
		double grossSalary=employee.getBasicSalary()+employee.getHra()+employee.getDa();
		double textAmount=(grossSalary * employee.getTextPercentage())/100;
		double netSalary=grossSalary-textAmount;
		System.out.println("Salary Slip for "+employee.getName());
		System.out.println("Gross Salary: "+grossSalary);
		System.out.println("Tax Deducted: "+textAmount);
		System.out.println("Net Salary: "+netSalary);
		
	}
	
	
	

}
