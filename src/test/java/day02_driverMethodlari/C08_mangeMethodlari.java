package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_mangeMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        System.out.println("maxsimize konum : "+driver.manage().window().getPosition());
        System.out.println("maxsimize boyut : "+driver.manage().window().getSize());
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        System.out.println("fullscreen konum : "+driver.manage().window().getPosition());
        System.out.println("fullscreen boyut : "+driver.manage().window().getSize());

        driver.close();
    }
}
