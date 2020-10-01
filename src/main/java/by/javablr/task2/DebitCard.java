package by.javablr.task2;

import by.javablr.task1.Card;
import by.javablr.task1.exceptions.NotEnoughMoneyException;

public class DebitCard extends Card {

    public DebitCard(String cardHolderName, double cardBalance) {
        super(cardHolderName, cardBalance);
    }

    public DebitCard(String cardHolderName) {
        super(cardHolderName);
    }

    @Override
    public void withdrawalBalance(double sumOfMoney) throws NotEnoughMoneyException {
        if (getCardBalance() < Math.abs(sumOfMoney))
            throw new NotEnoughMoneyException ("Sorry, there are not enough money on your card");
        else setCardBalance(getCardBalance() - Math.abs(sumOfMoney));
    }
}
