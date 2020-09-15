package com.company.hw5.exception;

public class NotEnoughMoneyException extends RuntimeException {
    public NotEnoughMoneyException() {
        super("Sorry, not enough money for this operation.");
    }
}
