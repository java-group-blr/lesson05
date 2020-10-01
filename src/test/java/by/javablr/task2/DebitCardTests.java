package by.javablr.task2;

import by.javablr.task1.exceptions.NotEnoughMoneyException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DebitCardTests {

    private DebitCard debitCard;
    private static final String CARD_HOLDER_NAME = "John Smith";
    private static final double CARD_BALANCE = 999.00;
    private static final double SUM_OF_MONEY = 1000.00;

    @Before
    public void setUp() {
        debitCard = new DebitCard(CARD_HOLDER_NAME, CARD_BALANCE);
    }

    @Test
    public void testConstructorWithName() {
        DebitCard debitCard = new DebitCard(CARD_HOLDER_NAME);
        Assert.assertEquals(debitCard.getCardHolderName(), CARD_HOLDER_NAME);
    }

    @Test
    public void testConstructorWithNameAndBalance() {
        DebitCard debitCard = new DebitCard(CARD_HOLDER_NAME, CARD_BALANCE);
        Assert.assertEquals(debitCard.getCardHolderName(), CARD_HOLDER_NAME);
        Assert.assertEquals(debitCard.getCardBalance(), CARD_BALANCE, 0);
    }

    @Test
    public void withdrawalBalance() throws NotEnoughMoneyException {
        try {
            debitCard.withdrawalBalance(-SUM_OF_MONEY);
        } catch (NotEnoughMoneyException ex) {
            System.out.println("Sorry, there are not enough money on your card");
        }
        Assert.assertEquals(CARD_BALANCE, debitCard.getCardBalance(), 0);
    }
}
