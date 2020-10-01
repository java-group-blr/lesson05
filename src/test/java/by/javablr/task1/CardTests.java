package by.javablr.task1;

import by.javablr.task1.exceptions.NotEnoughMoneyException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CardTests{

    private Card card;
    private static final String CARD_HOLDER_NAME = "John Smith";
    private static final double CARD_BALANCE = 999.00;
    private static final double SUM_OF_MONEY = 1000.00;
    private static final double CURRENCY_RATE = 2.60;

    @Before
    public void setUp() {
        card = new Card(CARD_HOLDER_NAME, CARD_BALANCE) {
            @Override
            public void withdrawalBalance(double sumOfMoney) throws NotEnoughMoneyException { }
        };
    }

    @Test
    public void testGetBalance() {
        Assert.assertEquals(CARD_BALANCE, card.getCardBalance(), 0);
    }

    @Test
    public void testGetCardBalanceInCurrency() {
        Assert.assertEquals(CARD_BALANCE / CURRENCY_RATE, card.getCardBalanceInCurrency(CURRENCY_RATE), 0);
    }

    @Test
    public void rechargeBalance() {
        card.rechargeBalance(SUM_OF_MONEY);
        Assert.assertEquals(CARD_BALANCE + SUM_OF_MONEY, card.getCardBalance(), 0);
    }

    @Test
    public void testGetCardHolderName() {
        Assert.assertEquals(CARD_HOLDER_NAME, card.getCardHolderName());
    }
}
