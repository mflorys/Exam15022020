package pl.qc.ita.selenium.task3;

import java.io.FileWriter;
import java.util.ArrayList;

public class task3 {


            WebDriver driver = new ChromeDriver();
            WebDriverWait wait = new WebDriverWait(driver, 20);

            driver.get("https://www.pracuj.pl/");
            //a) napisz asercję, czy adres strony zawiera "pl"
            assert driver.getPageSource().contains(".pl/");
            //b) napisz asercję, czy strona zawiera element: <span class="footerBR_Z5r">Nasz profil na Facebooku</span>. Wykorzystaj xpath.
            WebElement facebook = driver.findElement(By.xpath("//*[@id=\"kansas-footer\"]/footer/div[2]/div/a[1]/span[1]"));
            assert facebook.isDisplayed();
            // c) wypisz na terminalu wszystkie adresy URL zawierające słowo "pracuj". Zapisz te adresy - przydadzą się do następnych zadań.

            ArrayList<String> links = new ArrayList<String>();

            for (WebElement element :driver.findElements(By.tagName("a"))
            ) {
                if (element.getAttribute("href").contains("pracuj")){
                }
                links.add(element.getAttribute("href"));
                System.out.println(element.getAttribute("href"));
            }

            //d) zapisz adresy z punktu c) do pliku tekstowego.
            String filePath = "C://";
            FileWriter fileWriter = null;


            fileWriter = new FileWriter(filePath);
            fileWriter.write(links);
            finally {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            }
}
