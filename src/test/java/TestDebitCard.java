import com.company.hw5.DebitCard;
import com.company.hw5.exception.NotEnoughMoneyException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

public class TestDebitCard {

    private DebitCard testCard;
    private static final String NAME = "Alex";
    private static final double BALANCE = 1000.0;
    private static final double SUM = 500.0;
    private static final double RATE = 2.0;
    private static final double BIG_SUM = 500E30;

    @Before
    public void start() {
        testCard = new DebitCard(NAME, BALANCE);
    }

    @Test
    public void DebitCardConstructorTest1() {
        DebitCard card = new DebitCard(NAME, BALANCE);
        Assert.assertEquals(NAME, card.name);
        Assert.assertEquals(BALANCE, card.balance, 0.0000001);
    }

    @Test
    public void DebitCardConstructorTest2() {
        DebitCard card = new DebitCard(NAME);
        Assert.assertEquals(NAME, card.name);
        Assert.assertEquals(BALANCE, card.balance, 0.0000001);
    }

    @Test
    public void getExtraMoneyFromDebitCardTest() throws NotEnoughMoneyException {
        Throwable thrown = assertThrows(NotEnoughMoneyException.class, () ->
            testCard.getMoneyFromBalance(BIG_SUM)
        );
        assertNotNull(thrown.getMessage());
    }

    @Test
    public void getMoneyFromDebitCardTest() {
        testCard.getMoneyFromBalance(SUM);
        Assert.assertEquals(BALANCE - SUM, testCard.balance, 0.0000001);
    }

}