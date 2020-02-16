package pl.qc.ita.selenium.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Rozwiązanie {

    WebDriver driver;
    String url = "https://pracuj.pl";
    @Test
    void test() throws IOException {
        driver = new ChromeDriver();
        driver.get(url);
        //a
        Assertions.assertTrue(driver.getCurrentUrl().contains("pl"));
        //b
        WebElement span = driver.findElement(By.xpath("//span[@class=\"footerBR_Z5r\" and text()=\"Nasz profil na Facebooku\"]"));
        Assertions.assertTrue(span.isDisplayed());
        //c
        List<WebElement> list = driver.findElements(By.xpath("//a[contains(@href, \"pracuj\")]"));
        ArrayList<String> urls = new ArrayList<>();
        for (WebElement we : list
             ) {
            urls.add(we.getAttribute("href"));
            System.out.println(we.getAttribute("href"));
        }

        //d
        FileWriter file = null;

        file = new FileWriter("plik.txt");
        for (String s: urls
             ) {
            file.write(s);
            file.write('\n');
        }
        file.close();

        driver.close();
    }
}
