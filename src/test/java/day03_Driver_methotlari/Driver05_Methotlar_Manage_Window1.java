package day03_Driver_methotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver05_Methotlar_Manage_Window1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //*driver.manage( ).window( ).setPosition(new Point ( x:80 , y:0 ) ) ;
        //Browser’i istenen koordinata tasir
        //*driver.manage( ).window( ).setSize(new Dimension( 800 , 600 ));
        //Browser’i istenen olculere getirir.
        //*driver.manage( ).timeouts( ).implicitlyWait(Duration.ofSeconds(10));
        // Istenen sayfa acilincaya kadar maximum bekleme suresini belirtir
        //*driver.close( ); sadece calisilan browser'i kapatir
        //driver.quit( ); acik olan tum browser'lari kapatir

        //*Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get(" https://www.amazon.com/");
        //*Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());
        //*Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(200,500));
        driver.manage().window().setSize(new Dimension(515,650));
        //*Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        int xYon=driver.manage().window().getPosition().x;
        int yYon=driver.manage().window().getPosition().y;

        int genislik=driver.manage().window().getSize().getWidth();
        int yukseklik=driver.manage().window().getSize().getHeight();

        System.out.println("xYon = " + xYon);
        System.out.println("yYon = " + yYon);
        System.out.println("genislik = " + genislik);
        System.out.println("yukseklik = " + yukseklik);

        if (xYon==200&&yYon==500&&genislik==515&&yukseklik==650){
            System.out.println("olçme testi = PASS" );

        }else {
            System.out.println("olçme testi = FAİLED" );
        }

        //* Sayfayi kapatin
        Thread.sleep(5000);
driver.quit();



    }
}
