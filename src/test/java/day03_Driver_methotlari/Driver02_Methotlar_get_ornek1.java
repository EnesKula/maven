package day03_Driver_methotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver02_Methotlar_get_ornek1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //Sayfa basligini(title) yazdirin
        System.out.println("driver.getTitle = " +driver.getTitle());
        //Sayfa adresini(url) yazdirin
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        //Sayfa handle degerini yazdirin
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());
        //Sayfayi kapatin.,
        Thread.sleep(5000);

        driver.close();
    }
}
