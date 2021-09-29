package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Bejegyzes> beList = new ArrayList<>();
    public static void main(String[] args) {

        Bejegyzes b1 = new Bejegyzes("Anita", "Lenni vagy nem lenni, ez itt a kérdés");
        Bejegyzes b2 = new Bejegyzes("Andris", "Hol van az agy amikor az kellene?");
        beList.add(b1);
        beList.add(b2);
        System.out.println(beList);

    }
}
