package com.akatkar.demos.collectionframework;

import com.akatkar.demos.collectionframework.model.*;
import java.util.ArrayList;
import java.util.List;


public class ArrayListMergeDemo {

    private static final int MAX_COUNT = 7;
    private static List<Card> originalList;
    private static List<Card> newList;

    private static void showLists(String status) {
        System.out.println(status);
        System.out.println("Orijinal Liste               :" + originalList);
        System.out.println("İşlem yapılacak liste        :" + newList);
        System.out.println("");
    }

    private static void initializeLists() {

        originalList = new ArrayList<>();
        int i = 0;
        for (Rank rank : Rank.values()) {
            Card card = new Card(Suit.CLUBS, rank);
            i++;
            if (i == MAX_COUNT) {
                break;
            }
            originalList.add(card);
        }

        newList = new ArrayList<>();
        i = 0;
        for (Rank rank : Rank.values()) {
            i++;
            if (i < 3) {
                continue;
            }
            if (i == MAX_COUNT + 2) {
                break;
            }
            Card card = new Card(Suit.CLUBS, rank);
            newList.add(card);
        }
    }

    private static void deleteAll() {
        System.out.println("* * * Bir listeninin diğerinden çıkarılması  * * *");
        initializeLists();
        showLists("Listelerin işlem yapılmadan önceki durumu");
        // Yeni listede olan elemanlar orijinal listeden siliniyor
        originalList.removeAll(newList);
        showLists("Yeni listedeki elemanlar orijinal listeden silindi");
        System.out.println("-----------------------------------------");
    }

    private static void addingDifferentMembers() {
        System.out.println("* * * Farklı Olanları Eklemek * * *");
        initializeLists();
        showLists("Listelerin işlem yapılmadan önceki durumu");
        newList.removeAll(originalList);
        originalList.addAll(newList);
        showLists("Orijinal listeye yeni listedeki yeni elemanlar eklendi ");
        System.out.println("-----------------------------------------");
    }

    private static void findIntersection() {
        System.out.println("* * * İki Listenin Birleştirilmesi * * *");
        initializeLists();
        showLists("Listelerin işlem yapılmadan önceki durumu");
        // Orijinal listede olup, yeni listede olmayanlar çıkarılıyor
        // Bu işlem aynı zamanda silme işlemi oluyor.
        originalList.retainAll(newList);
       
        showLists("Orijinal listeye yeni listedeki yeni elemanlar eklendi ");
        System.out.println("-----------------------------------------");
    }

    public static void main(String[] args) {

        deleteAll();
        addingDifferentMembers();
        findIntersection();
    }
}
