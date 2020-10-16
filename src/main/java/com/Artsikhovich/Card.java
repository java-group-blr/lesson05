package com.Artsikhovich;
public class Card {
    public String name;
    public double balance;
    public Card(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public Card(String name) {
        this.name = name;
        this.balance = 0;
    }
    public double getBalance() {
        return this.balance;
    }
    public void addBalance(double add) {
        this.balance += add;
    }
    public void subBalance(double sub) {
        this.balance -= sub;
    }
    public double getExchangeBalance(double rate) {
        return this.balance / rate;
    }
}
