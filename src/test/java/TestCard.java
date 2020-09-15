import com.company.hw5.Card;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCard {
    private Card testCard;
    private static final String NAME = "Alex";
    private static final double BALANCE = 1000.0;
    private static final double SUM = 500.0;
    private static final double RATE = 2.0;

    @BeforeEach
    public void start() {
        testCard = new Card(NAME, BALANCE);
    }

    @Test
    public void cardConstructorTest1() {
        Card card = new Card(NAME, BALANCE);
        assertEquals(NAME, card.name);
        assertEquals(BALANCE, card.balance);
    }

    @Test
    public void getBalanceTest() {
        assertEquals(BALANCE, testCard.getBalance());
    }

    @Test
    public void putMoneyOnBalanceTest() {
        testCard.putMoneyOnBalance(SUM);
        assertEquals(SUM + BALANCE, testCard.balance);
    }

    @Test
    public void getMoneyFromBalanceTest() {
        testCard.getMoneyFromBalance(SUM);
        assertEquals(BALANCE - SUM, testCard.balance);
    }

    @Test
    public void convertBalanceTest() {
        assertEquals(BALANCE / RATE, testCard.convertBalance(RATE));
    }
}