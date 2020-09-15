package com.company.hw5;

public class DebitCard extends Card {

    DebitCard(String name, double balance){
        super(name, balance);
    }

    DebitCard(String name){
        super(name);
    }

    @Override
    public void getMoneyFromBalance(double sum) {
        if(balance - sum < 0) return;
        balance -= sum;
    }


}
