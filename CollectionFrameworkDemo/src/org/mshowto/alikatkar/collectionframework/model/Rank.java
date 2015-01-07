/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mshowto.alikatkar.collectionframework.model;

/**
 *
 * @author akatkar
 */
public enum Rank {

    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("J"),
    QUEEN("Q"),
    KING("K"),
    ACE("A");
    
    
    private String symbol;

    private Rank(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
