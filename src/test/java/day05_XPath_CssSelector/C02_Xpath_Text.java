package day05_XPath_CssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath_Text {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //*https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //*Add Element butonuna 3 defa basin
         WebElement delete= driver.findElement(By.xpath("//*[.='Add Element']"));
         delete.click();
         delete.click();
         delete.click();
        //*Delete butonu’nun 2. sinin gorunur oldugunu test edin
        WebElement deletButon=driver.findElement(By.xpath("//*[@id=\"elements\"]/button[2]"));
        if (deletButon.isDisplayed()){
            System.out.println("Delete buton görünüyor Test PASS");
        }else {
            System.out.println("Delete buton görünmüyor Test FAİLED");
        }

        //*Delete tusuna 3. olana basin
        driver.findElement(By.xpath("(//*[.=\"Delete\"])[3]")).click();
        //*“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        /*
        if (driver.findElement(By.xpath(" //*[.=\"Add/Remove Elements\"]")).isDisplayed()){
            System.out.println("Add/Remove Elements görünüyor Test Pass");
        }else{
            System.out.println("Add/Remove Elements görünmüyor Test FAİLED");
        }*/
        WebElement addbText=driver.findElement(By.xpath("//*[.=\"Add/Remove Elements\"]"));

        String actualtext="Add/Remove 2Elements";
        String expectedText=addbText.getText();
        System.out.println("expectedText = " + expectedText);
        if (actualtext.equals(expectedText)){
            System.out.println("TEST PASS");
        }else {
            System.out.println("TEST FAİLED");
        }

    }
}
