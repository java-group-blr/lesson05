import com.company.hw5.Card;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCard {

    private Card testCard;
    private static final String NAME = "Alex";
    private static final double BALANCE = 1000.0;
    private static final double SUM = 500.0;
    private static final double RATE = 2.0;

    @Before
    public void start() {
        testCard = new Card(NAME, BALANCE);
    }

    @Test
    public void cardConstructorTest1() {
        Card card = new Card(NAME, BALANCE);
        Assert.assertEquals(NAME, card.name);
        Assert.assertEquals(BALANCE, card.balance, 0.0000001);
    }

    @Test
    public void cardConstructorTest2() {
        Card card = new Card(NAME);
        Assert.assertEquals(NAME, card.name);
        Assert.assertEquals(BALANCE, card.balance, 0.0000001);
    }

    @Test
    public void getBalanceTest() {
        Assert.assertEquals(BALANCE, testCard.getBalance(), 0.0000001);
    }

    @Test
    public void putMoneyOnBalanceTest() {
        testCard.putMoneyOnBalance(SUM);
        Assert.assertEquals(SUM + BALANCE, testCard.balance, 0.0000001);
    }

    @Test
    public void getMoneyFromBalanceTest() {
        testCard.getMoneyFromBalance(SUM);
        Assert.assertEquals(BALANCE - SUM, testCard.balance, 0.0000001);
    }

    @Test
    public void convertBalanceTest() {
        Assert.assertEquals(BALANCE / RATE, testCard.convertBalance(RATE), 0.0000001);
    }
}