package pl.qc.ita.java.task6;

/*
Stwórz mapę, która przechowuje pary nazwisko i imię. Usuń wszystkie takie elementy, w których imiona się powtarzają.
Wypisz przekształconą mapę na ekranie.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Rozwiazanie {

    public static void main(String[] args) {

        usunWkoncuteImonaTyDziwko(stworzMape());
        System.out.println("dupa");

    }

    public static HashMap<String, String> stworzMape() {

        HashMap<String, String> names = new HashMap<String, String>();

        names.put("Minuczyc", "Ewa");
        names.put("Krejewska", "Anna");
        names.put("Krajewska", "Anna");
        names.put("Dziewiór", "Sławek");
        names.put("Szymkiewicz", "Cezary");
        names.put("Szymański", "Piotr");
        names.put("Zebrzydowicz", "Anna");
        names.put("chuj", "Stanisław");
        names.put("asd", "gaga");
        names.put("sese", "makumba");

        return names;
    }

    public static void usunWkoncuteImonaTyDziwko(Map<String, String> map) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : map.values()) {
            if (!list.contains(s)) {
                list.add(s);
            } else {
                list2.add(s);
            }
        }
        for (String j : list2) {
            usunElementMapyPoValue(map, j);
        }
    }

    public static void usunElementMapyPoValue(Map<String, String> mapa, String value) {
        HashMap<String, String> kopia = new HashMap<String, String>(mapa);
        for (Map.Entry<String, String> pair : kopia.entrySet()) {
            if (pair.getValue().equals(value)) {
                mapa.remove(pair.getKey());
            }
        }
    }
}
