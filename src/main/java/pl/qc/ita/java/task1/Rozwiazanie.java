package pl.qc.ita.java.task1;

/*
Stwórz klasy Kobieta i Mezczyzna z parametrami wiek i wzrost o odpowiednich typach.
Klasa Kobieta powinna zawierać atrybut przechowujący referencję do obiektu klasy Mezczyzna o nazwie maz.
Klasa Mezczyzna powinna zawierać atrybut przechowujący referencję do obiektu klasy Kobieta o nazwie zona.

Utwórz po dwa konstruktory dla klas. Jeden przyjmujący jedynie atrybuty o typach prostych, drugi definiujący wszystkie atrybuty.

W metodzie main utwórz małżeństwo używając w tym celu 2 linii kodu.

*/

public class Rozwiazanie {
    public static void main(String[] args) {

        Mezczyzna mezczyzna = new Mezczyzna(30, 183);
        Kobieta kobieta = new Kobieta(30, 165.0, mezczyzna);

        mezczyzna.setZona(kobieta);


    }
}

/*
OK, ale nie doczytałeś ostatniego zdania w zadaniu.

Chodziło o:
Mezczyzna mezczyzna = new Mezczyzna(30, 183, new Kobieta(30, 165.0));
mezczyzna.getZona().setMaz(mezczyzna);
 */