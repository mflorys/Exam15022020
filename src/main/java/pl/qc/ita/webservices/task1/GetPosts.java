package pl.qc.ita.webservices.task1;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;

import io.restassured.http.ContentType;

import org.junit.Test;


public class GetPosts {

  private String URL = "https://cdnjs.cloudflare.com";


  @Test
  public void statusCodeShouldReturn200WhenGettingAllPosts() {

    when().get(URL).then().statusCode(200);
  }


}