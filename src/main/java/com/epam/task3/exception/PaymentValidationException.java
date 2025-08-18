package com.epam.task3.exception;

public class PaymentValidationException extends Exception {
    public PaymentValidationException(String message) {
        super(message);
    }
    
    public PaymentValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}