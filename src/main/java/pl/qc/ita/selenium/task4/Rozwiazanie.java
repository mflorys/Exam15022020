package pl.qc.ita.selenium.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rozwiazanie {
    WebDriver driver;
    WebDriverWait wait;
    String url = "https://go-sport.pl";

    @Test
    void test() {
        driver = new ChromeDriver();
        driver.get(url);
        wait = new WebDriverWait(driver, 10);

        //a
        WebElement spanPrice = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("price")));
        String basketValue = spanPrice.getText();
        //System.out.println(basketValue);

        Assertions.assertTrue(basketValue.equals("0,00 ZŁ"));

        //b
        WebElement sportyButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-3")));
        sportyButton.click();

        WebElement firstProductInfo = wait.until(ExpectedConditions.presenceOfElementLocated((By.cssSelector("div.products.wrapper.grid.products-grid > div:nth-child(1)"))));
        firstProductInfo.click();

        WebElement addToCart = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
        addToCart.click();

        //c
        WebElement spanCounterNumber = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("counter-number")));
        spanPrice = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("price")));
        String counterText = spanCounterNumber.getText().replaceAll("\\D", "");
        String priceText = spanPrice.getText().replaceAll(" ZŁ", "");
        priceText = priceText.replace(",", ".");

        int counterNum = Integer.parseInt(counterText);
        double totalPrice = Double.parseDouble(priceText);
        Assertions.assertTrue(counterNum == 1);
        Assertions.assertTrue(totalPrice > 0.0);
        //System.out.println(counterNum + "  " + totalPrice);

        //d
        WebElement basketButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a.action.showcart")));
        basketButton.click();

        WebElement deleteButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a.action.action-delete")));
        deleteButton.click();

        WebElement submiDeleteButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button.action-primary.action-accept")));
        submiDeleteButton.click();

        spanPrice = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("price")));
        basketValue = spanPrice.getText();

        Assertions.assertTrue(basketValue.equals("0,00 ZŁ"));

        driver.close();
    }
}
