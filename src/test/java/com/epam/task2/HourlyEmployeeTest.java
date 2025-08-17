package com.epam.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HourlyEmployeeTest {
    @Test
    void calculatePay() {
        Employee e = new HourlyEmployee("Lewis", 100, 30);
        assertEquals(3000.0, e.calculatePay().amount());
    }

    @Test
    void calculateBonus() {
        Employee e = new HourlyEmployee("Lewis", 100, 30);
        assertEquals(300.0, e.calculateBonus().amount());
    }
}
