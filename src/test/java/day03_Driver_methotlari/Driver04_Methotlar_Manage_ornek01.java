package day03_Driver_methotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver04_Methotlar_Manage_ornek01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//* Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
//*Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        //*Sayfayi simge durumuna getirin
        Thread.sleep(3000);
        driver.manage().window().minimize();
//Simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();
//Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        Thread.sleep(3000);
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());
//Sayfayi fullscreen yapin
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
//Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        Thread.sleep(3000);
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());
//Sayfayi kapatin
        Thread.sleep(3000);
        driver.quit();
    }
}
