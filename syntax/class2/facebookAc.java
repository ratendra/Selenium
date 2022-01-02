package Selenium.syntax.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookAc {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Create")).click();
        Thread.sleep(300);
        driver.findElement(By.name("firstname")).sendKeys("peter");
        driver.findElement(By.name("lastname")).sendKeys("parker");
        driver.findElement(By.name("reg_email__")).sendKeys("parker_spiderman@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("kamehameha");
        driver.findElement(By.name("birthday_month")).sendKeys("03");
        driver.findElement(By.name("birthday_day")).sendKeys("28");
        driver.findElement(By.name("birthday_year")).sendKeys("1991");
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.linkText("Sign up")).click();

    }
}
