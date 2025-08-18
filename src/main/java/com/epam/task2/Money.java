package com.epam.task2;

public record Money(double amount) {

    @Override
    public String toString() {
        return String.format("$%.2f", amount);
    }
}
