package com.akatkar.sample.collection.model;

public class Card implements Comparable<Card> {
    // Kartın Rengi:Sinek, Karo, Kupa, Maça
    private final Suit suit;
    // Kartın değeri: 2,3,4,5,6,7,8,9,10,J,D,K,A
    private final Rank rank;
    
    public Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Card other = (Card) obj;
        return this.suit == other.suit && this.rank == other.rank;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.suit != null ? this.suit.hashCode() : 0);
        hash = 47 * hash + (this.rank != null ? this.rank.hashCode() : 0);
        return hash;
    }

    public int compareTo(Card other) {
        if (this.suit == other.suit) {
            return this.rank.compareTo(other.rank);
        }
        return this.suit.compareTo(other.suit);
    }

    @Override
    public String toString() {
        return ""+ suit + rank ;
    }
}
