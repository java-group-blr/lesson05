package com.Artsikhovich;

public class CreditCard extends Card {

    public CreditCard(String name, double balance) {
        super (name, balance);
    }

    public CreditCard(String name) {
        super (name);
        this.balance = 0;
    }
}
