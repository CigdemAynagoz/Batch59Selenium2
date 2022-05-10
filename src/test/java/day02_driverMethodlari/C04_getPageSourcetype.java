package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_getPageSourcetype {
    public static void main(String[] args) {
        // amazon sitesine gidip Kaynak kodlarinda "spend less" yazdigini test edin
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        String sayfaKaynaklari=driver.getPageSource();
        String arananKelime="Amazon EXport Sales";
        if (sayfaKaynaklari.contains(arananKelime)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("kaynak kodlarında "+arananKelime+" yok,Test FAILED");
        }
        driver.close();
    }
}
