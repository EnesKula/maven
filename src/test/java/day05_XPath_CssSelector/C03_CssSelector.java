package day05_XPath_CssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_CssSelector {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//*Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
//*Locate email textbox
        WebElement email=driver.findElement(By.cssSelector("#session_email"));
//*Locate password textbox ve
        WebElement password=driver.findElement(By.cssSelector("input[placeholder=\"Password\"]"));
//*Locate signin button
       WebElement sign=driver.findElement(By.cssSelector(" input[value=\"Sign in\"]"));
//*Asagidaki kullanıcı adını ve şifreyi girin ve sign in duğmesini tıklayın
//*Username :testtechproed@gmail.com
// *Password : Test1234!
email.sendKeys("testtechproed@gmail.com");
password.sendKeys("Test1234!");
sign.click();

WebElement simple=driver.findElement(By.tagName("h4"));

        System.out.println("simple.getText() = " + simple.getText());
//*NOT: cssSelector kullanarak elementleri locate ediniz.
        driver.close();
    }
}
