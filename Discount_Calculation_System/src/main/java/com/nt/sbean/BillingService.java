package com.nt.sbean;

public final class BillingService {

    private final DiscountStrategy discountStrategy;

    public BillingService(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void generateBill(double amount) {

        System.out.println("Original Amount: ₹" + amount);

        double discount = discountStrategy.calaculateDiscount(amount);
        System.out.println("Final Payable Amount: ₹" + discount);
    }
}