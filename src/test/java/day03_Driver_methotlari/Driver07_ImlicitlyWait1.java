package day03_Driver_methotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver07_ImlicitlyWait1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // ! 14 ve 15. satırları herseferinde yazacağız..
        //* // implicitly wait testimiz boyunca soyfo acilmasi ve element bulunmasi konusundo driver'in
        // * bekleyecegi maximum sureyi belirler.
        // *Bu sure icerisinde gorevini bitirir bitirmez, bir sonraki adima gecer
        // *Bu sure icerisinde gorevini bitiremezse o zaman hata verir
        // *Belirlenen maximum sure Thread.sleep'deki gibi mutlak beklene suresi degildir

        driver.get("https://getir.com");
      //!  Thread.sleep(5000);
        driver.close();
    }
}
