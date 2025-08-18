package com.epam.task2;

public class HourlyEmployee extends Employee {
    private final double hourlyRate;
    private final double hoursWorked;

    public HourlyEmployee(String name, double hourlyRate, double hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public Money calculatePay() {
        return new Money(hourlyRate * hoursWorked);
    }

    // let bonus be 10% of the total pay
    @Override
    public Money calculateBonus() {
        return new Money(hourlyRate * hoursWorked * 0.10);
    }
}
