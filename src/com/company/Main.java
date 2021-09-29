package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Bejegyzes> beList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void kettoPerb(){
        System.out.println("Addja meg mennyi új bejegyzést akar: ");
        int szam = sc.nextInt();
        String szerzo, tartalom;
        for (int i = 0; i < szam; i++) {
            int j=i+1;
            System.out.println(j + ". bejegyzés:");
            System.out.println("Szerző: ");
            szerzo = sc.next();
            System.out.println("Tartalom: ");
            tartalom = sc.next();
            Bejegyzes l = new Bejegyzes(szerzo, tartalom);
            beList.add(l);
        }
        System.out.println(beList);

    }
    public static void main(String[] args) {

        Bejegyzes b1 = new Bejegyzes("Anita", "Lenni vagy nem lenni, ez itt a kérdés");
        Bejegyzes b2 = new Bejegyzes("Andris", "Hol van az agy amikor az kellene?");
        beList.add(b1);
        beList.add(b2);
        System.out.println(beList);

        kettoPerb();




    }
}
