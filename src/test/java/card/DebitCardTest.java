package card;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DebitCardTest {
    private final double VARIABLE = 300;
    private final double VARIABLE2 = 100;
    private final double BALANCE_TEST = 200;
    private final String NAME_TEST = "MR.Neelixs";
    private final double PERCENT_TEST = 11.13;
    private final double delta = 0.00001;
    private DebitCard debitCard;

    @BeforeEach
    public void setUP() {
        debitCard = new DebitCard(NAME_TEST);
        debitCard.setBalance(BALANCE_TEST);
    }
    @Test
    public void withDrawTest (){
        debitCard.withDraw(VARIABLE);
        Assertions.assertEquals(BALANCE_TEST-VARIABLE,debitCard.getBalance(),delta);
    }
    @Test
    public void depositTest(){
        debitCard.deposit(PERCENT_TEST);
        Assertions.assertEquals(BALANCE_TEST*PERCENT_TEST / (100) ,debitCard.getBalance(),delta);
    }
}