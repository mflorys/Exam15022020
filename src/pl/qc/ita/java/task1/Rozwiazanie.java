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

Kobieta Frania = new Kobieta();
Mężczyzna Franek = new Mężczyzna(20,170,Frania);

    }
}

/*
Brak klas Kobieta i Mezczyzna (a co za tym idzie - atrybutów, konstruktora).
Frania w tym rozwiązaniu nie posiada męża.
 */