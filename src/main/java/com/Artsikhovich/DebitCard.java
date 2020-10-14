package com.Artsikhovich;

public class DebitCard extends Card {

    public DebitCard(String name, double balance) {
        super (name, balance);
    }
    public DebitCard(String name) {
        super (name);
        this.balance = 0;
    }
    @Override
    public void subBalance(double sub) {
        if (balance >= sub) {
            this.balance -= sub;
        } else {
            System.out.println("Not enough money on the account.");
        }
    }
}
