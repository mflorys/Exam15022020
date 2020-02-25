package pl.qc.ita.java.task2;

/*
Popraw konstruktor klasy Kolo z dwoma parametrami tak, aby po jego wywołaniu tworzone było koło o promieniu 15. Wykorzystaj w tym celu jedną linijkę kodu.

Hint: wywołaj w konstruktorze istniejący konstruktor.
 */

public class Rozwiazanie {
    public static void main(String[] args) {
        Kolo kolo = new Kolo(5,5,1);
        System.out.println(kolo.x + " " + kolo.y + " " + kolo.promien);
        Kolo inneKolo = new Kolo(10, 5);
        System.out.println(inneKolo.x + " " + inneKolo.y + " " + inneKolo.promien);
    }
}

/*
OK
 */