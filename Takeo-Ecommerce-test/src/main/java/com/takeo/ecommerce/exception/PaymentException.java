package com.takeo.ecommerce.exception;

public class PaymentException extends RuntimeException {
    public PaymentException(String message){
        super(message);
    }
}
