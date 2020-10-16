package com.Artsikhovich;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CardTest {
    Card card1 = new Card("Vasya", 2000);
    Card card2 = new Card("Petya");

    @Test
    void testConstructorFull() {
        Card card3 = new Card("Maria", 16000);
        Assert.assertEquals("Maria", card3.name);
        Assert.assertEquals(16000, card3.balance, 0.0000001);
    }
    @Test
    void testConstructorName() {
        Card card4 = new Card("Katia");
        Assert.assertEquals("Katia", card4.name);
        Assert.assertEquals(0, card4.balance, 0.0000001);
    }
    @Test
    void testGetBalance() {
        Assert.assertEquals(2000, card1.getBalance(), 0.0000001);
        Assert.assertEquals(0, card2.getBalance(), 0.0000001);
    }

    @Test
    void testAddBalance() {
        card1.addBalance(450);
        Assert.assertEquals(2450, card1.balance, 0.0000001);
        card2.addBalance(320);
        Assert.assertEquals(320, card2.balance, 0.0000001);
    }

    @Test
    void testSubBalance() {
        card1.subBalance(350);
        Assert.assertEquals(1650, card1.balance, 0.0000001);
        card1.subBalance(3650);
        Assert.assertEquals(-2000, card1.balance, 0.0000001);
        card2.subBalance(320);
        Assert.assertEquals(-320, card2.balance, 0.0000001);
    }

    @Test
    void testGetExchangeBalance() {
        Assert.assertEquals(800, card1.getExchangeBalance(2.5), 0.0000001);
        card2.addBalance(6200);
        Assert.assertEquals(2000, card2.getExchangeBalance(3.1), 0.0000001);
    }
}