package by.javablr.task2;

import by.javablr.task1.Card;

public class DebitCard extends Card {

    public DebitCard(String cardHolderName, double cardBalance) {
        super(cardHolderName, cardBalance);
    }

    public DebitCard(String cardHolderName) {
        super(cardHolderName);
    }

    @Override
    public void withdrawalBalance(double sumOfMoney) {
        if (super.getCardBalance() - sumOfMoney < 0)
            System.out.println("Sorry, there are not enough funds on your card");
        else super.withdrawalBalance(sumOfMoney);
    }
}
