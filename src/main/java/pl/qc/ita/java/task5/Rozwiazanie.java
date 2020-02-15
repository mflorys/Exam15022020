package pl.qc.ita.java.task5;

/*
Wprowadź liczbę z klawiatury. Wypisz na ekranie liczbę cyfr parzystych i nieparzystych we wprowadzonej liczbie.

Wynik dla 50111:
Parzyste: 1 Nieparzyste: 4
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rozwiazanie {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());
        int even = 0;
        int odd = 0;

        while (num > 0) {
            int mod = num % 10;
            if (mod % 2 == 0) even++;
            else odd++;
            num = num / 10;
        }

        System.out.println("Parzyste: " + even + " Nieparzyste: " + odd);
    }
}
