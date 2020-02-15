package pl.qc.ita.java.task6;

/*
Stwórz mapę, która przechowuje pary nazwisko i imię. Usuń wszystkie takie elementy, w których imiona się powtarzają.
Wypisz przekształconą mapę na ekranie.
 */

import java.util.*;

public class Rozwiazanie {
    public static void main(String[] args) {
        HashMap<String, String> map = stworzMape();

        Collection<String> names = map.values();

//        usunElementMapyPoValue(map, "Jan");
//
//        for (Map.Entry<String, String> pair : map.entrySet()) {
//            System.out.println(pair.getKey() + " " + pair.getValue());
//        }
        for (String s: names
             ) {
            System.out.println(s);
        }
    }

    public static HashMap<String, String> stworzMape() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Kowlaski", "Jan");
        map.put("Nowak", "Jan");
        map.put("Kowal", "Janusz");
        return map;
    }

    public static void usunElementMapyPoValue(Map<String, String> mapa, String value) {
        HashMap<String, String> kopia = new HashMap<String, String>(mapa);
        for (Map.Entry<String, String> pair : kopia.entrySet()) {
            if (pair.getValue().equals(value))
                mapa.remove(pair.getKey());
        }
    }
}
