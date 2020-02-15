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

        Set<Integer> mojSet = new HashSet<Integer>(20);

        for(int i=0; i < 20; i++){
            mojSet.add(i*2);
        }

        System.out.println("HashSet before removal : " + mojSet);

        mojSet.removeIf(number -> number < 20);

        System.out.println("HashSet after removal : " + mojSet);
    }
}




