package com.akatkar.sample.collection.model;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Card> {

    private int getSuitOrdinal(Card c){
        if(c.getSuit() == Suit.HEARTS)
            return c.getSuit().ordinal() + 2;
        return c.getSuit().ordinal();
    }
    
    public int compare(Card card1, Card card2) {
        return card1.getSuit() == card2.getSuit() ?
                card1.getRank().compareTo(card2.getRank()) :
                getSuitOrdinal(card1) - getSuitOrdinal(card2);
    }    
}

