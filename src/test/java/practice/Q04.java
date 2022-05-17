package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q04 {
    // ...Exercise4...
    // Navigate to  https://testpages.herokuapp.com/styled/index.html
    // Click on  Calculate under Micro Apps
    //    Type any number in the first input
    //    Type any number in the second input
    // Click on Calculate
    // Get the result
    // Print the result
    //.Exercise4...
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // https:testpages.herokuapp.comstyledindex.html adresine gidin
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        // Mikro Uygulamalar altında Hesapla'ya tıklayın
        driver.findElement(By.id("calculatetest")).click();
        Thread.sleep(2000);

        // İlk girişe herhangi bir sayı yazın
        driver.findElement(By.id("number1")).sendKeys("20");

        // İkinci girişe herhangi bir sayı yazın Hesapla'ya tıklayın
        driver.findElement(By.id("number2")).sendKeys("30");

        driver.findElement(By.id("calculate")).click();

        // Sonucu al Sonucu yazdırın
        System.out.println(driver.findElement(By.id("answer")).getText());

        Thread.sleep(2000);
        driver.close();
    }
}
