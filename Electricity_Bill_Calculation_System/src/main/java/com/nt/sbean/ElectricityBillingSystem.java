package com.nt.sbean;

public class ElectricityBillingSystem {
    BillingStrategy bill;

	public ElectricityBillingSystem(BillingStrategy bill) {
		super();
		this.bill = bill;
	}
    
    public void showBill(double units ,int rate) {
    	double calculateBill = bill.calculateBill(units,rate);
    	System.out.println("Total Bill Amount: ₹"+calculateBill);
    }
}
