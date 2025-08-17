package com.epam.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommissionedEmployeeTest {
    @Test
    void calculatePay() {
        Employee e = new CommissionedEmployee("Lewis", 0.10, 10000);
        assertEquals(1000.0, e.calculatePay().amount());
    }

    @Test
    void calculateBonus() {
        Employee e = new CommissionedEmployee("Lewis", 0.10, 10000);
        assertEquals(500.0, e.calculateBonus().amount());
    }

    @Test
    void zeroSales() {
        Employee e = new CommissionedEmployee("Lewis", 0.15, 0);
        assertEquals(0.0, e.calculatePay().amount());
        assertEquals(0.0, e.calculateBonus().amount());
    }
}
