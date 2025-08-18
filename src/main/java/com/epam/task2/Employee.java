package com.epam.task2;

public abstract class Employee {
    private String name;
    private EmployeeType type;

    public Employee(String name) {
        this.name = name;
    }

    public abstract Money calculatePay();

    public abstract Money calculateBonus();

    public String getName() {
        return name;
    }
}
