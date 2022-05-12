package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazona gidip nutella aratalım
        driver.get("https://www.amazon.com");
        //findelement(by..locators) istwedigimiz web elementini bize dondurur
        //biz de o web elementini kullanmak icin bir obj assing ederiz
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));

        //herhangi bir elementi aramak istersek

        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);


    }
}
