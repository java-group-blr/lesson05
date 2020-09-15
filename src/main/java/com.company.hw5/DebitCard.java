package com.company.hw5;

import com.company.hw5.exception.NotEnoughMoneyException;

public class DebitCard extends Card {

    public DebitCard(String name, double balance) {
        super(name, balance);
    }

    public DebitCard(String name) {
        super(name);
    }

    @Override
    public void getMoneyFromBalance(double sum) {
        if (balance - sum < 0) {
            throw new NotEnoughMoneyException();
        }
        else {
            balance -= sum;
        }
    }


}
