package by.javablr.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CreditCardTests {

    private CreditCard creditCard;
    private static final String CARD_HOLDER_NAME = "John Smith";
    private static final double CARD_BALANCE = 999.00;
    private static final double SUM_OF_MONEY = 1000.00;

    @Before
    public void setUp() {
        creditCard = new CreditCard(CARD_HOLDER_NAME, CARD_BALANCE);
    }

    @Test
    public void testConstructorWithName() {
        CreditCard creditCard = new CreditCard(CARD_HOLDER_NAME);
        Assert.assertEquals(creditCard.getCardHolderName(), CARD_HOLDER_NAME);
    }

    @Test
    public void testConstructorWithNameAndBalance() {
        CreditCard creditCard = new CreditCard(CARD_HOLDER_NAME, CARD_BALANCE);
        Assert.assertEquals(creditCard.getCardHolderName(), CARD_HOLDER_NAME);
        Assert.assertEquals(creditCard.getCardBalance(), CARD_BALANCE, 0);
    }

    @Test
    public void withdrawalBalance() {
        creditCard.withdrawalBalance(-SUM_OF_MONEY);
        Assert.assertEquals(CARD_BALANCE - Math.abs(SUM_OF_MONEY), creditCard.getCardBalance(), 0);
    }
}
