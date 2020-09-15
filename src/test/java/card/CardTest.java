package card;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CardTest {
    private final double VARIABLE = Math.random() * 100;
    private final double BALANCE_TEST = 650.60;
    private final String NAME_TEST = "MR.Neelixs";
    private final double CON_TEST = 2.58;
    private final double delta = 0.00001;
    private Card card;

    @BeforeEach
    public void setUP() {
        card = new Card(NAME_TEST, BALANCE_TEST);
    }

    @Test
    public void ConstruktorTest() {
        Card card = new Card(NAME_TEST);
        final double CARD_RANDOM = card.getBalance();
        Assertions.assertEquals(CARD_RANDOM, card.getBalance(), delta);
    }

    @Test
    public void getNameTest() {
        Assertions.assertEquals(NAME_TEST, card.getName());
    }

    @Test
    public void setNAME_TEST() {
        card.setName(NAME_TEST);
        Assertions.assertEquals(NAME_TEST, card.getName());
    }

    @Test
    public void printBalanceTest() {
        Assertions.assertEquals(BALANCE_TEST, card.getBalance(), delta);
    }

    @Test
    public void topUpTest() {
        card.topUp(VARIABLE);
        Assertions.assertEquals(BALANCE_TEST + VARIABLE, card.getBalance(), delta);
    }

    @Test
    public void withDrawTest() {
        card.withDraw(VARIABLE);
        Assertions.assertEquals(BALANCE_TEST - VARIABLE, card.getBalance(), delta);
    }

    @Test
    public void converterTest() {
        card.converter(CON_TEST);
        Assertions.assertEquals(BALANCE_TEST / CON_TEST, card.getBalance(), delta);
    }
} 