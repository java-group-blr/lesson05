package com.company.hw5;

public class Card {

    public String name;
    public double balance;

    public Card(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public Card(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    public double getBalance(){
        return balance;
    }

    public void putMoneyOnBalance(double sum){
        balance += sum;
    }

    public void getMoneyFromBalance(double sum) {
        balance -= sum;
    }

    public double convertBalance(double course){
        return balance/course;
    }
}
