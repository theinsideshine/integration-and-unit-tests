package com.theinsideshine.test.springboot.app.springboot_test.exceptions;

public class DineroInsuficienteException extends RuntimeException{
    public DineroInsuficienteException(String message) {
        super(message);
    }
}
