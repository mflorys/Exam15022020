package pl.qc.ita.java.task3;

/*
Napisz program, który będzie przyjmował liczby od użytkownika. Gdy użytkownik wprowadzi wyraz suma, program wyświetli sumę dotychczas wprowadzonych liczb.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rozwiazanie {
    public static void main(String[] args) throws IOException {
        System.out.println(sumaWprowadzonychLiczb());
    }

    public static int sumaWprowadzonychLiczb() throws IOException {
        int sum = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = reader.readLine();
            if (!s.equals("suma")) sum += Integer.parseInt(s);
            else break;
        }

        return sum;
    }
}
