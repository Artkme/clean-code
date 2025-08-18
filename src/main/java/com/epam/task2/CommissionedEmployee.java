package com.epam.task2;

public class CommissionedEmployee extends Employee {
    private final double commissionRate;
    private final double sales;

    public CommissionedEmployee(String name, double commissionRate, double sales) {
        super(name);
        this.commissionRate = commissionRate;
        this.sales = sales;
    }

    @Override
    public Money calculatePay() {
        return new Money(sales * commissionRate);
    }

    // let bonus be 5% of the total pay
    @Override
    public Money calculateBonus() {
        return new Money(sales * 0.05);
    }
}
