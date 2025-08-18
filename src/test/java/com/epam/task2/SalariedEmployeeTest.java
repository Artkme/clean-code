package com.epam.task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SalariedEmployeeTest {
    @Test
    void calculatePay() {
        Employee e = new SalariedEmployee("Lewis", 3000);
        assertEquals(3000.0, e.calculatePay().amount());
    }

    @Test
    void calculateBonus() {
        Employee e = new SalariedEmployee("Lewis", 3000);
        assertEquals(240.0, e.calculateBonus().amount());
    }
}