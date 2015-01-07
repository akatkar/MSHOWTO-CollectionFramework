/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mshowto.alikatkar.collectionframework.arraylist.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.mshowto.alikatkar.collectionframework.model.Card;
import org.mshowto.alikatkar.collectionframework.model.PlayerComparator;
import org.mshowto.alikatkar.collectionframework.model.Rank;
import org.mshowto.alikatkar.collectionframework.model.Suit;

/**
 *
 * @author akatkar
 */
public class ArrayListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List deck = new ArrayList();
        
        for(Suit suit:Suit.values()){
            for(Rank rank:Rank.values()){
                Card card = new Card(suit, rank);
                deck.add(card);
            }
        }
        
        System.out.println("deck:"+deck);
        
        Collections.shuffle(deck);
        
        System.out.println("deck:"+deck);
        
        Collections.sort(deck);
        
        System.out.println("deck:"+deck);
        
        Card card = new Card(Suit.CLUBS, Rank.ACE);
        
        int i = Collections.binarySearch(deck, card);
        System.out.println(card +" destede "+ i+ ". indekste");
        
        Collections.shuffle(deck);
        
        Collections.sort(deck, new PlayerComparator());
        System.out.println("deck:"+deck);
         
    }
}
