package com.epam.task2;

public class SalariedEmployee extends Employee {
    private final double salary;

    public SalariedEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public Money calculatePay() {
        return new Money(salary);
    }

    // let bonus be 8% of the total salary
    @Override
    public Money calculateBonus() {
        return new Money(salary * 0.08);
    }
}
