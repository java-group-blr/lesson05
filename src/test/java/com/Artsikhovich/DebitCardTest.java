package com.Artsikhovich;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DebitCardTest {

    @Test
    void testConstructorFull() {
        DebitCard card = new DebitCard("Kotor Michael", 6000);
        Assert.assertEquals("Kotor Michael", card.name);
        Assert.assertEquals(6000, card.balance, 0.0000001);
    }

    @Test
    void testConstructorName() {
        DebitCard card = new DebitCard("Dima ACID");
        Assert.assertEquals("Dima ACID", card.name);
        Assert.assertEquals(0, card.balance, 0.0000001);
    }
    @Test
    void subBalance() {
        DebitCard card1 = new DebitCard("Kotor Michael", 6000);
        card1.subBalance(1050);
        Assert.assertEquals(4950, card1.balance, 0.0000001);
        card1.subBalance(7000);
        Assert.assertEquals(4950, card1.balance, 0.0000001);
        DebitCard card2 = new DebitCard("Dima ACID");
        card2.addBalance(200);
        card2.subBalance(50);
        Assert.assertEquals(150, card2.balance, 0.0000001);
        card2.subBalance(2000);
        Assert.assertEquals(150, card2.balance, 0.0000001);
    }
}

