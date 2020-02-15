package pl.qc.ita.webservices.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.when;

public class Rozwiązanie {

    String url1 = "https://pracodawcy.pracuj.pl/";
    String url2 = "https://cv.pracuj.pl/";
    String url3 = "https://porady.pracuj.pl/";
    String url4 = "https://zarobki.pracuj.pl/";
    String url5 = "https://dlafirm.pracuj.pl/";

    @Test
     void testURL() {
        int statusCode1 = when().get(url1).statusCode();
        Assertions.assertTrue(statusCode1!=404);
        int statusCode2 = when().get(url2).statusCode();
        Assertions.assertTrue(statusCode2!=404);
        int statusCode3 = when().get(url3).statusCode();
        Assertions.assertTrue(statusCode3!=404);
        int statusCode4 = when().get(url4).statusCode();
        Assertions.assertTrue(statusCode4!=404);
        int statusCode5 = when().get(url5).statusCode();
        Assertions.assertTrue(statusCode5!=404);
    }
}
