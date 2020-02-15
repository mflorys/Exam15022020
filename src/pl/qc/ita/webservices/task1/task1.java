package pl.qc.ita.webservices.task1;

import java.util.Scanner;

public class task1 {


    public static void main(String[] args) {

        String[] adresy = {
                "https://grupapracuj.pl/polityka-prywatnosci",
                "https://grupapracuj.pl/grupa-kapitalowa/polityka-plikow-cookie",
                "https://www.facebook.com/pracuj",
                "https://www.youtube.com/user/pracuj",
                "https://www.instagram.com/pracuj.pl/"
        };

        for (String adress : adresy
        ) {

            when().get(adress).then().statusCode(200);
        }
    }


}
