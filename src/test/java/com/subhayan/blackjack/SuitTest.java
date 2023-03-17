package com.subhayan.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuitTest {

    @Test
    void printHearts() {
        assertEquals("\u2665", Suit.HEARTS.toString());
    }
}