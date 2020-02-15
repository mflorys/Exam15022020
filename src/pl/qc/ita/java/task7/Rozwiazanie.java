package pl.qc.ita.java.task7;

/*
Stwórz set liczb całkowitych i dodaj 20 elementów do setu.
Usuń wszystkie wartości większe niż 10.
Wyświetl set na ekranie.
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Rozwiazanie {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Random random = new Random();
        for(int i=0;i<20;i++){
            set.add(random.nextInt(20)+1);
        }

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            int num = iterator.next();
            if(num>10) iterator.remove();
        }

        System.out.println(set);
    }
}
