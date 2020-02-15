package pl.qc.ita.java.task6;

/*
Stwórz mapę, która przechowuje pary nazwisko i imię. Usuń wszystkie takie elementy, w których imiona się powtarzają.
Wypisz przekształconą mapę na ekranie.
 */

import java.util.HashMap;
import java.util.Map;

public class Rozwiazanie {
    public static void main(String[] args) {
        //Twój kod
    }

    public static HashMap<String, String> stworzMape(){
        //Twój kod
        return null;
    }

    public static void usunElementMapyPoValue(Map<String, String> mapa, String value) {
        HashMap<String, String> kopia = new HashMap<String, String>(mapa);
        for (Map.Entry<String, String> pair : kopia.entrySet()) {
            if (pair.getValue().equals(value))
                mapa.remove(pair.getKey());
        }
    }
}
