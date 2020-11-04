package by.javablr.task2;

import by.javablr.task1.Card;

public class CreditCard extends Card {

    public CreditCard(String cardHolderName, double cardBalance) {
        super(cardHolderName, cardBalance);
    }

    public CreditCard(String cardHolderName) {
        super(cardHolderName);
    }

    @Override
    public double getCardBalanceInCurrency(double currencyRate) {
        return getCardBalance() / currencyRate;
    }

    @Override
    public void rechargeBalance(double sumOfMoney) {
        setCardBalance(getCardBalance() + sumOfMoney);
    }

    @Override
    public void withdrawalBalance(double sumOfMoney) {
        setCardBalance(getCardBalance() - Math.abs(sumOfMoney));
    }
}
