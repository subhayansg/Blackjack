package com.subhayan.blackjack;

public enum Rank {
    ACE(1),   // acts like constructors
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);

    private int value;

    Rank(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
/*
    public int getValue() {
        return switch (this) {   // each of the attributes of the Rank enum can be thought of as an instance of enum class
            case JACK, QUEEN, KING -> 10;
            default -> ordinal() + 1;  // each instance of the enum inherits the ordinal method
        };
    }
 */
}
