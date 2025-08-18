package com.epam.task3;

import com.epam.task3.exception.PaymentProcessingException;
import com.epam.task3.exception.PaymentValidationException;

public class PayPalPaymentStrategy extends PaymentMethod {
    private final String accountEmail;
    private final boolean linkedToBankAccount;

    public PayPalPaymentStrategy(String accountEmail, boolean linkedToBankAccount) {
        this.accountEmail = accountEmail;
        this.linkedToBankAccount = linkedToBankAccount;
    }

    void validatePaymentDetails() throws PaymentValidationException {
        if (accountEmail == null || accountEmail.isEmpty()) {
            throw new PaymentValidationException("PayPal account email is required");
        }
        if (!accountEmail.contains("@")) {
            throw new PaymentValidationException("Invalid email format");
        }
    }

    void processPayment(double amount) throws PaymentProcessingException {
        if (amount <= 0) {
            throw new PaymentProcessingException("Payment amount must be positive");
        }
        if (!linkedToBankAccount) {
            throw new PaymentProcessingException("PayPal account not linked to bank account");
        }
        System.out.println("PayPal paid: $" + amount);
    }
}