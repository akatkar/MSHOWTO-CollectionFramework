/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mshowto.alikatkar.collectionframework.model;

/**
 *
 * @author akatkar
 */
public enum Suit {

    CLUBS("\u2663"), 
    DIAMONDS("\u2666"), 
    HEARTS("\u2665"), 
    SPADES("\u2660");
    
    private String symbol;

    private Suit(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
