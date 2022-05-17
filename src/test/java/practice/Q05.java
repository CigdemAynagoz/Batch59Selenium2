package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q05 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to website  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        // Under the  ORIGINAL CONTENTS click on Alerts
        //ORİJİNAL İÇERİKLER altında Uyarılar'a tıklayın
        driver.findElement(By.xpath("//a[@id='alerts']")).click();
        Thread.sleep(2000);

        // print the URL
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);

        // navigate back
        driver.navigate().back();
        Thread.sleep(2000);

        // print the URL
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);

        // Click on Basic Ajax
        driver.findElement(By.xpath("//a[@id='basicajax']")).click();
        Thread.sleep(2000);

        // print the URL
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);

        // enter value-> 20 and Enter
        driver.findElement(By.id("lteq30")).sendKeys("20"+ Keys.ENTER);
        Thread.sleep(4000);

        // and then verify Submitted Values is displayed open page(ve ardından Gönderilen Değerlerin açık sayfada görüntülendiğini doğrulayın)

        if (driver.findElement(By.xpath("//*[text()='Submitted Values']")).isDisplayed()){
            System.out.println("goruldu");
        }else {
            System.out.println("gorulmedi");
        }

        // close driver
        driver.close();

    }
}
