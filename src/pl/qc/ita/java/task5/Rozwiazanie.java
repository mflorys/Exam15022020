package pl.qc.ita.java.task5;

/*
Wprowadź liczbę z klawiatury. Wypisz na ekranie liczbę cyfr parzystych i nieparzystych we wprowadzonej liczbie.

Wynik dla 50111:
Parzyste: 1 Nieparzyste: 4
 */

import java.util.Scanner;

public class Rozwiazanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int parzyste = 0;
        int nieparzyste = 0;
        String[]input = scanner.next().split("");
        for (String znak:input
             ) {
            if (Integer.parseInt(znak) % 2 == 0){
                parzyste++;
            }else nieparzyste++;
        }
        System.out.println("Parzyste: "+parzyste+" Nieparzyste: "+nieparzyste);
    }
}
