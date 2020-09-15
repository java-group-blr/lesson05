package card;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreditCardTest {
    private final double VARIABLE = 300;
    private final double BALANCE_TEST = 200;
    private final String NAME_TEST = "MR.Neelixs";
    private final double delta = 0.00001;
    private CreditCard creditCard;

    @BeforeEach
    public void setUP() {
        creditCard = new CreditCard(NAME_TEST, BALANCE_TEST);
    }

    @Test
    public void withDrawTest() {
        creditCard.withDraw(VARIABLE);
        Assertions.assertEquals(BALANCE_TEST - VARIABLE, creditCard.getBalance(), delta);
    }
}
