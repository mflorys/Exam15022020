package pl.qc.ita.java.task5;

/*
Wprowadź liczbę z klawiatury. Wypisz na ekranie liczbę cyfr parzystych i nieparzystych we wprowadzonej liczbie.

Wynik dla 50111:
Parzyste: 1 Nieparzyste: 4
 */

import java.util.Scanner;

public class Rozwiazanie {

    public static void main(String[] args) {

        int num = 0, even = 0, count = 0;
        Scanner scanner = new Scanner(System.in);

        num = scanner.nextInt();
        if (num % 2 == 0) {
            even = even + 1;
        }
        count = count + 1;

        System.out.println("parzyste" + even);
        System.out.println("nieparzyste" + (count - even));
    }
}

/*
0p.

Twój wynik dla 50111 to:
parzyste0
nieparzyste1

 */


