package nt.EmployeeSalarySlipApp;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int id;
	private String name;
	private double basicSalary;
	private double hra;
	private double da;
	private double textPercentage;
	

	public Employee() {
        this.id = 101;
        this.name = "Nitish Kumar";
        this.basicSalary = 50000;
        this.hra = 10000;
        this.da = 5000;
        this.textPercentage = 10;
    }
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public double getHra() {
		return hra;
	}
	public double getDa() {
		return da;
	}
	public double getTextPercentage() {
		return textPercentage;
	}
	
	
	

}
