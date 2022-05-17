package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q03 {
    // ...Exercise3...
// go to url : https://www.techlistic.com/p/selenium-practice-form.html
//fill the firstname
//fill the firstname
//check the gender
//check the experience
//fill the date
//choose your profession -> Automation Tester
//choose your tool -> Selenium Webdriver
//choose your continent -> Antartica
//choose your command  -> Browser Commands
//click submit button
    /*Exercise3... url'ye gidin : https:www.techlistic.compselenium-practice-form.html
     adı doldurun adı doldurun cinsiyeti kontrol edin deneyimi kontrol edin tarihi doldurun
     mesleğinizi seçin -> Otomasyon Test Cihazı aracınızı seçin
     - > Selenium Webdriver kıtanızı seçin -> Antartica komutunuzu seçin ->
     Tarayıcı Komutları gönder düğmesine tıklayın*/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        driver.findElement(By.name("firstname")).sendKeys("Cigdem");

        driver.findElement(By.name("lastname")).sendKeys("Aynagoz");

        driver.findElement(By.id("sex-1")).click();

        driver.findElement(By.id("exp-0")).click();

        driver.findElement(By.id("datepicker")).sendKeys("16.05.2022");

        driver.findElement(By.id("profession-1")).click();

        driver.findElement(By.id("tool-2")).click();

        driver.findElement(By.xpath("//option[.='Antartica']")).click();

        driver.findElement(By.xpath("//option[text()='Browser Commands']")).click();

        driver.findElement(By.xpath("//button[@id='submit']")).click();

        Thread.sleep(2000);

        driver.close();

        




    }
}
