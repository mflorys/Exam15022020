package pl.qc.ita.java.task7;

/*
Stwórz set liczb całkowitych i dodaj 20 elementów do setu.
Usuń wszystkie wartości większe niż 10.
Wyświetl set na ekranie.
 */

import java.util.HashSet;
import java.util.Set;

public class Rozwiazanie {

    public static void main(String[] args) {

        Set<Integer> mojSet = new HashSet<>(20);

        mojSet.add(1);
        mojSet.add(2);
        mojSet.add(3);
        mojSet.add(4);

        System.out.println("HashSet before removal : " + mojSet);

        boolean isRemoved = mojSet.remove(new Integer("2"));


        System.out.println("HashSet after removal : " + mojSet);
    }
}




