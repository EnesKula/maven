package day03_Driver_methotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_Methotlar_get1 {
    public static void main(String[] args) throws InterruptedException {


        /*
         * driver.get("https://www.youtube.com"); istediğimiz web sayfasına gider.
         * driver.getTitle( ); Icinde olunan sayfanin basligini String olarak getirir
         * driver.getCurrentUrl( ); Icinde olunan sayfanin Url’ini String olarak getirir
         * driver.getPageSource( ); Icinde olunan sayfanin kaynak kodlarini String olarak getirir
         * driver.getWindowHandle( );	Icinde olunan sayfa ve/veya tab’larin
         * driver.getWindowHandles( ); handle degerlerini getirir
         * driver.manage().window().maximize(); calistigimiz browser’i tam sayfa yapar
         * driver.navigate().refresh(); calistigimiz browser’i refresh yapar (yeniler)
         * driver.navigate().to("https://www.google.com/"); istediğimiz web sayfasına gider.
         * get()’den farkli olarak navigate ile gittigimiz sayfadan back() ve forward() komutlarini kullanabiliriz.
         * driver.navigate().back(); navigate() ile geldigimiz bir onceki sayfaya gider
         * driver.navigate().forward(); navigate() ile gidip geri dondugumuz sayfaya yeniden gider
         * driver.close(); sadece calisilan browser'i kapatir
         * driver.quit(); acik olan tum browser'lari kapatir
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       // driver.get("https://www.youtube.com");
        driver.get("https://selenium.dev");

        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.getTitle();
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        System.out.println("driver.getPageSource() = " + driver.getPageSource());
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandles());
 Thread.sleep(10000);
 driver.quit();







    }

}
