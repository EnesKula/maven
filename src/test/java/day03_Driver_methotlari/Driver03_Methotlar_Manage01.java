package day03_Driver_methotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver03_Methotlar_Manage01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        /*
        *driver.manage( ).window( ).maximize( ); Browser’i maximize yapar
        * driver.manage( ).window( ).minimize( ); Browser’i minimize yapar
        * driver.manage( ).window( ).fullscreen( ); Browser’i full screen yapar
        * driver.manage( ).window( ).getPosition( ); Browser’in koordinatlarini verir
        * driver.manage( ).window( ).getSize( ); Browser’in olculerini verir
         */
        driver.get("https://www.amazon.com");
        Thread.sleep(5000);


    }
}
