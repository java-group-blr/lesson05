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
    public void withdrawalBalance(double sumOfMoney) {
        setCardBalance(getCardBalance() - Math.abs(sumOfMoney));
    }
}
