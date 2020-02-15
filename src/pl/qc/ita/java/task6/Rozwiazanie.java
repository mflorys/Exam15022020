package pl.qc.ita.java.task6;

/*
Stwórz mapę, która przechowuje pary nazwisko i imię. Usuń wszystkie takie elementy, w których imiona się powtarzają.
Wypisz przekształconą mapę na ekranie.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Rozwiazanie {
    public static void main(String[] args) {

        HashMap<String,String> daneOsobowe = stworzMape();
        HashMap<String,String> daneOsoboweKopia = new HashMap<String,String> (daneOsobowe);

        daneOsobowe.clear();

        for (String nazwisko:daneOsoboweKopia.keySet()
             ) {
            String imię = daneOsoboweKopia.get(nazwisko);
            if (daneOsobowe.containsValue(imię)){
            }else {
                daneOsobowe.put(nazwisko,imię);
            }

        }

        for (String key:daneOsobowe.keySet()
             ) {
            System.out.println(key+" "+daneOsobowe.get(key));
        }


    }

    public static HashMap<String, String> stworzMape(){
        String[]nazwiska = {"Węgliński","Gołaś","Hajduk","Kuriata","Jarząbek","Klecha","Tkaczyk","Rydel","Kapusta","Stefanek"," Wojna","Tomecki"};
        String[]imiona= {"Anna","Maria","Katarzyna","Małgorzata","Agnieszka","Krystyna","Barbara","Ewa"};
        HashMap <String,String> lista = new HashMap<>();
        Random random = new Random();
        for (String n:nazwiska
             ) {
            lista.put(n,imiona[random.nextInt(imiona.length)]);
        }
        return lista;
    }

    public static void usunElementMapyPoValue(Map<String, String> mapa, String value) {
        HashMap<String, String> kopia = new HashMap<String, String>(mapa);
        for (Map.Entry<String, String> pair : kopia.entrySet()) {
            if (pair.getValue().equals(value))
                mapa.remove(pair.getKey());
        }
    }
}
