package com.epam.task3;

import com.epam.task3.exception.PaymentProcessingException;
import com.epam.task3.exception.PaymentValidationException;

import java.time.format.DateTimeParseException;

public class CreditCardPaymentStrategy extends PaymentMethod {
    private final String cardNumber;
    private final String expiryDate;
    private final String cvv;

    public CreditCardPaymentStrategy(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    void validatePaymentDetails() throws PaymentValidationException {
        if (cardNumber == null || cardNumber.isEmpty()) {
            throw new PaymentValidationException("Card number is required");
        }
        if (expiryDate == null || expiryDate.isEmpty()) {
            throw new PaymentValidationException("Expiry date is required");
        }
        if (cvv == null || cvv.isEmpty()) {
            throw new PaymentValidationException("CVV is required");
        }
        
        try {
            if (!java.time.LocalDate.parse(expiryDate).isAfter(java.time.LocalDate.now())) {
                throw new PaymentValidationException("Card has expired");
            }
        } catch (DateTimeParseException e) {
            throw new PaymentValidationException("Invalid expiry date format", e);
        }
    }

    void processPayment(double amount) throws PaymentProcessingException {
        if (amount <= 0) {
            throw new PaymentProcessingException("Payment amount must be positive");
        }
        System.out.println(amount + " paid with credit/debit card.");
    }
}