package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        /*
        İlerde wait konusunu daha geniş olarak ele alacagız.
        bir sayfa acılırken ilk asts sayfanın ıcerisinde bulunan
        elemenetlere göre bir yuklenme suresine ihtiyac vardir
        veya bir web elementinin kullanılabilmesi icin zamana ihy olablr
        implciwait bize sayfanıjn yuklenmesi icin ve sayfadaki elementlere ulasım ıcın beklenecek
        maxsimum sureyi belirleme olanagi tanır
        *acilanana kadar bekleme*
        */
        driver.close();
    }
}
