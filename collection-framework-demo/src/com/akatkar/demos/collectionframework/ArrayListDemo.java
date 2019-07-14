package com.akatkar.demos.collectionframework;

import com.akatkar.demos.collectionframework.model.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayListDemo {

    public static void main(String[] args) {
        
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
