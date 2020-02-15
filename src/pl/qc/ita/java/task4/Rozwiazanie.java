package pl.qc.ita.java.task4;

/*
Posiadasz klasy Kaczka, Pingwin i Slimak, które powinny dziedziczyć po klasie IstotaZywa.
1. Zaimplementuj dla każdej z trzech klas reprezentujących zwierzęta wszytskie niezbędne interfejsy.
2. W każdej z klas nadpisz metodę wydajDzwiek(), żeby zwierzęta wydawały stosowne dźwięki (przyjmij, że pingwin robi "łiii", a ślimak "aaaaajee").
3. Dla każdej klasy dziedziczącej dodaj jeden atrybut i stwórz konsruktor wywołujący konstruktor klasy nadrzędnej oraz przypisujący wartość dodanemu atrybutowi.
Program musi się kompilować.
Klasy nie mogą być abstrakcyjne.

Stówrz po jednym zwierzęciu i wywołaj w każdym metodę wydajDzwiek().

Wyświetl na ekranie odpowiedź na pytanie - jaką regułę programowania obiektowego przedstawia poniższa linijka?

IstotaZywa istotaZywa = new Kaczka();

 */

public class Rozwiazanie {
    public static void main(String[] args) {

        Kaczka kaczka = new Kaczka("Pawel", 11, 2);
        Pingwin pingwin = new Pingwin("Maciej", 120, 2);
        Slimak slimak = new Slimak("Andżela", 340, true);

        kaczka.wydajDzwiek();
        pingwin.wydajDzwiek();
        slimak.wydajDzwiek();

        System.out.println("polimorfizm");

    }
}
