package pl.qc.ita.java.task3;

/*
Napisz program, który będzie przyjmował liczby od użytkownika. Gdy użytkownik wprowadzi wyraz suma, program wyświetli sumę dotychczas wprowadzonych liczb.
 */

import java.util.Scanner;

public class Rozwiazanie {
    public static void main(String[] args) {
        System.out.println(sumaWprowadzonychLiczb());
    }

    public static int sumaWprowadzonychLiczb() {
        int sum = 0;

        //Twój kod
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("podaj liczbę lub SUMA");
            String input = scanner.next().toLowerCase().trim();
            if (input.equals("suma")) {
                break;
            }else {
                sum = sum + Integer.parseInt(input);
            }
        }

        return sum;

    }
}
