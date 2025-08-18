package com.epam.task3;

import com.epam.task3.exception.PaymentProcessingException;
import com.epam.task3.exception.PaymentValidationException;

public class PaymentProcessor {
    public void makePayment(PaymentMethod payment, double amount) throws PaymentValidationException, PaymentProcessingException, PaymentValidationException, PaymentProcessingException {
        payment.validatePaymentDetails();
        payment.processPayment(amount);
    }
}