package org.mshowto.alikatkar.collectionframework.arraylist.demo;

import java.util.ArrayList;
import java.util.List;
import org.mshowto.alikatkar.collectionframework.model.Card;
import org.mshowto.alikatkar.collectionframework.model.Rank;
import org.mshowto.alikatkar.collectionframework.model.Suit;

/**
 *
 * @author akatkar
 */
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

        originalList = new ArrayList<Card>();
        int i = 0;
        for (Rank rank : Rank.values()) {
            Card card = new Card(Suit.CLUBS, rank);
            i++;
            if (i == MAX_COUNT) {
                break;
            }
            originalList.add(card);
        }

        newList = new ArrayList<Card>();
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
        System.out.println("* * * Bir listeninin diðerinden çýkarýlmasý  * * *");
        initializeLists();
        showLists("Listelerin iþlem yapýlmadan önceki durumu");
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

    private static void mergeTwoList() {
        System.out.println("* * * İki Listenin Birleştirilmesi * * *");
        initializeLists();
        showLists("Listelerin işlem yapılmadan önceki durumu");
        // Orijinal listede olup, yeni listede olmayanlar çıkarılıyor
        // Bu işlem aynı zamanda silme işlemi oluyor.
        originalList.retainAll(newList);

        // Orijinal listede olup, yeni listede olanlar çıkarılıyor
        // Var olan elemanlar değişmesin diye yapıyoruz
        newList.removeAll(originalList);


        // Orijinal listede olup, yeni listede olanlar çıkarılıyor
        // Yeni elemanlar ekleniyor
        originalList.addAll(newList);

        showLists("Orijinal listeye yeni listedeki yeni elemanlar eklendi ");
        System.out.println("-----------------------------------------");
    }

    public static void main(String[] args) {

        deleteAll();
        addingDifferentMembers();
        mergeTwoList();
    }
}
