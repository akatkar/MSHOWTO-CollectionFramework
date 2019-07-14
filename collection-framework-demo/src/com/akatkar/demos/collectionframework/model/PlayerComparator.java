package com.akatkar.demos.collectionframework.model;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Card> {

    private int getSuitOrdinal(Card c){
        if(c.getSuit() == Suit.HEARTS)
            return c.getSuit().ordinal() + 2;
        return c.getSuit().ordinal();
    }
    
    @Override
    public int compare(Card card1, Card card2) {
        
        int suit1 = getSuitOrdinal(card1);
        int suit2 = getSuitOrdinal(card2);
        
        int rank1 = card1.getRank().ordinal();
        int rank2 = card2.getRank().ordinal();
        
        if(suit1 > suit2)
            return 1;
        else if(suit1 < suit2)
            return -1;
        else if(rank1 > rank2 )
            return 1;
        else  if(rank1 < rank2 )
            return -1;
        return 0;        
    }    
}
