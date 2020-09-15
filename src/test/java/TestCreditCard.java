import com.company.hw5.CreditCard;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCreditCard {

    private CreditCard testCard;
    private static final String NAME = "Alex";
    private static final double BALANCE = 1000.0;
    private static final double SUM = 500.0;
    private static final double RATE = 2.0;

    @Before
    public void start() {
        testCard = new CreditCard(NAME, BALANCE);
    }

    @Test
    public void CreditCardConstructorTest1() {
        CreditCard card = new CreditCard(NAME, BALANCE);
        Assert.assertEquals(NAME, card.name);
        Assert.assertEquals(BALANCE, card.balance, 0.0000001);
    }

    @Test
    public void CreditCardConstructorTest2() {
        CreditCard card = new CreditCard(NAME);
        Assert.assertEquals(NAME, card.name);
        Assert.assertEquals(BALANCE, card.balance, 0.0000001);
    }

}