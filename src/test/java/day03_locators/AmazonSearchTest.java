package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;

public class AmazonSearchTest {

/* Tekrar Testi
 1. Bir class oluşturun : AmazonSearchTest
 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
         a.google web sayfasına gidin. https://www. amazon.com/
 b. Search(ara) "city bike"
 c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
 d. "Shopping" e tıklayın.
 e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.*/
public static void main(String[] args) throws InterruptedException {
    //  a.google web sayfasına gidin. https://www. amazon.com/
    System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    driver.get("https://amazon.com/");

    // b. Search(ara) "city bike"
    WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
    aramaKutusu.sendKeys("city bike"+ Keys.ENTER);

    // c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
    WebElement aramaSonuc=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div"));
    String sonucSayisi[]= aramaSonuc.getText().split(" ");
    System.out.println("Sayfadaki sonuc sayisi: "+sonucSayisi[2]);

    // d. "Shopping" e tıklayın.
  //Agam shopping nirdedir :D bulamadik :)

    // e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
    WebElement ilkSonuc=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img"));
    ilkSonuc.click();
    Thread.sleep(2000);

    driver.get("https://bkmkitap.com");
    Thread.sleep(2000);

    driver.navigate().back();
    Thread.sleep(2000);

    driver.navigate().forward();
    Thread.sleep(2000);

    driver.close();
}
}
