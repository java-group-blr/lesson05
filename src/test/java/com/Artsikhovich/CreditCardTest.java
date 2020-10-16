package com.Artsikhovich;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CreditCardTest {

    @Test
    void testConstructorFull() {
        CreditCard card = new CreditCard("Kotor Michael", 6000);
        Assert.assertEquals("Kotor Michael", card.name);
        Assert.assertEquals(6000, card.balance, 0.0000001);
    }

    @Test
    void testConstructorName() {
        CreditCard card = new CreditCard("Dima ACID");
        Assert.assertEquals("Dima ACID", card.name);
        Assert.assertEquals(0, card.balance, 0.0000001);
    }
}