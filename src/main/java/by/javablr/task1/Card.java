package by.javablr.task1;

import by.javablr.task1.exceptions.NotEnoughMoneyException;

public abstract class Card {
    private String cardHolderName;
    private double cardBalance;

    public Card(String cardHolderName, double cardBalance) {
        this.cardHolderName = cardHolderName;
        this.cardBalance = cardBalance;
    }

    public Card(String cardHolderName) {
        this.cardHolderName = cardHolderName;
        this.cardBalance = 999.00;
    }

    public double getCardBalance() {
        return cardBalance;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public void setCardBalance(double cardBalance) {
        this.cardBalance = cardBalance;
    }

    public abstract double getCardBalanceInCurrency(double currencyRate);

    public abstract void rechargeBalance(double sumOfMoney);

    public abstract void withdrawalBalance(double sumOfMoney) throws NotEnoughMoneyException;

}