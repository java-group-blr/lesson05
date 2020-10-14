package com.Artsikhovich;

public class Main {
    public static void main(String[] args) {
        Card cardPrior = new CreditCard ("Kotor", 3200.4);
        System.out.println("Balance Credit Card = " + cardPrior.getBalance());
        cardPrior.addBalance(250);
        System.out.println("Add 250 = " + cardPrior.getBalance());
        System.out.printf("Exchange $ = %.2f $\n", cardPrior.getExchangeBalance(2.665));
        cardPrior.subBalance(3800);
        System.out.printf("sub 3800 = %.2f\n", cardPrior.getBalance());
        System.out.println("------------------------------");
        Card cardBelarusBank = new DebitCard ("Dima_Acid");
        System.out.println("Balance Debit Card = " + cardBelarusBank.getBalance());
        cardBelarusBank.addBalance(2500);
        System.out.println("Add 2500 = " + cardBelarusBank.getBalance());
        System.out.printf("Exchange EURO = %.2f EUR\n", cardBelarusBank.getExchangeBalance(3.15));
        cardBelarusBank.subBalance(1380);
        System.out.printf("sub 1380 = %.2f\n", cardBelarusBank.getBalance());
        System.out.println("Try sub 3200");
        cardBelarusBank.subBalance(3200);
        System.out.println("Balance = " + cardBelarusBank.getBalance());
    }
}
