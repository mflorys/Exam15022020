package pl.qc.ita.webservices.task2;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class Rozwiazanie {
    private static final String URL = "http://localhost:3000/posts";

    @Test
    void createPost(){
        Map<String, Object> postData = new HashMap<>();
        postData.put("title", "tytul 1602");
        postData.put("author", "autor 1602");

        int postId = given().contentType(ContentType.JSON).body(postData)
                .when().post(URL).then().statusCode(201).extract().path("id");

        when().get(URL+ "/"+postId).then()
                .body("id", equalTo(postId))
                .and().body("title", equalTo("tytul 1602"))
                .and().body("author", equalTo("autor 1602"));
    }

}
