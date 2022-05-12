package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
     /*
        1.
Yeni bir class olusturalim (Homework)
2.
ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
3.
Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
yazdirin.
4.
https://www.walmart.com/ sayfasina gidin.
5.
Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
6.
Tekrar “facebook” sayfasina donun
7.
Sayfayi yenileyin
8.
Sayfayi tam sayfa (maximize) yapin
9.
Browser’i kapatin
         */
     public static void main(String[] args) throws InterruptedException {
         //1.Yeni bir class olusturalim (Homework)

         System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
         WebDriver driver = new ChromeDriver();

         //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.

         driver.get("https://www.facebook.com");
         Thread.sleep(2000);
         System.out.println("facebook title = " + driver.getTitle());

         String actualTitle= driver.getTitle();
         String arananKelime="facebook";
         if (actualTitle.contains(arananKelime)){
             System.out.println("Title passed");
         }else {
             System.out.println("Title FAILED.Olması gereken: "+actualTitle);
         }
         //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.

         System.out.println("facebook Url = " + driver.getCurrentUrl());
         String actuelUrl= driver.getCurrentUrl();
         String aranan="facebook";
         if (actuelUrl.equals(aranan)){
             System.out.println("Url facebook kelimesini iceriyor");
         }else {
             System.out.println("Url facebook kelimesini icermiyor.ActuelUrl: "+actuelUrl);
         }

         //4.https://www.walmart.com/ sayfasina gidin.

         driver.get("https://www.walmart.com/");
         Thread.sleep(2000);
         //5.Sayfa basliginin “Walmart.com” icerdigini dogrulayin.

         System.out.println("Walmart.com title: " + driver.getTitle());
         String arananBaslik="Walmart.com";
         if (actualTitle.contains(arananBaslik)){
             System.out.println("test PASSED");
         }

         //6.Tekrar “facebook” sayfasina donun

         driver.navigate().back();
         Thread.sleep(2000);

         //7.Sayfayi yenileyin

         driver.navigate().refresh();
         Thread.sleep(2000);

         //8.Sayfayi tam sayfa (maximize) yapin

         driver.manage().window().maximize();
         Thread.sleep(2000);

         //9.Browser’i kapatin

        driver.close();

     }
}
