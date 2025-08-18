package com.epam.task3;

import com.epam.task3.exception.PaymentProcessingException;
import com.epam.task3.exception.PaymentValidationException;

public abstract class PaymentMethod {
    abstract void validatePaymentDetails() throws PaymentValidationException;
    abstract void processPayment(double amount) throws PaymentProcessingException;
}