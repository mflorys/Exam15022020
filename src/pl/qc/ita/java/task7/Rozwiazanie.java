package pl.qc.ita.java.task7;

/*
Stwórz set liczb całkowitych i dodaj 20 elementów do setu.
Usuń wszystkie wartości większe niż 10.
Wyświetl set na ekranie.
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Rozwiazanie {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> setOfValues = new HashSet<>();
        while (setOfValues.size() < 20) {
            setOfValues.add(random.nextInt(60));
        }
        for (int i:setOfValues
        ) {
            System.out.println(i);
        }

        setOfValues.removeIf(integer -> integer >10);

        for (int i:setOfValues
             ) {
            System.out.println(i);
        }
    }
}

