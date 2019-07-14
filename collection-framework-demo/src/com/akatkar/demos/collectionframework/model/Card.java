package com.akatkar.demos.collectionframework.model;

public class Card implements Comparable {
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
        if (this.suit != other.suit) {
            return false;
        }
        return this.rank == other.rank;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.suit != null ? this.suit.hashCode() : 0);
        hash = 47 * hash + (this.rank != null ? this.rank.hashCode() : 0);
        return hash;
    }

    @Override
    public int compareTo(Object obj) {
        if (obj == null) {
            return -1;
        }
        if (getClass() != obj.getClass()) {
            return -1;
        }
        final Card other = (Card) obj;
        if (this.suit.ordinal() > other.suit.ordinal()) {
            return 1;
        }
        if (this.suit.ordinal() < other.suit.ordinal()) {
            return -1;
        }        
        
        // Bu noktada her iki kart aynı renktedir(suit)
        if (this.rank.ordinal() > other.rank.ordinal()) {
            return 1;
        }
        if (this.rank.ordinal() < other.rank.ordinal()) {
            return -1;
        }
        
        // Normal olarak kod buraya hiç gelmemeli. Her bir card'dan sadece bir tane olacağından 
        // iki kart eşit olamaz. (En azından bir deste için)
        return 0;
    }

    @Override
    public String toString() {
        return ""+ suit + rank ;
    }    
}
