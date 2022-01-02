package Selenium.syntax.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatingelement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");//Launch the browser
        WebDriver driver=new ChromeDriver(); //nagivate to specified url
        driver.get("https://www.facebook.com/");
        //driver.findElement(By.id("email")).sendKeys("ratendra25@gmail.com");

        driver.findElement(By.id("email")).sendKeys("moazzamdkjs@gmail.com");
        driver.findElement(By.name("passs")).sendKeys("jsajhfjahfj");
      //  driver.findElement(By.name("login")).click();
        driver.findElement(By.linkText("Forgotten password?")).click();
       // driver.findElement(By.partialLinkText("Forgotten")).click();
        driver.quit();
    }
}
