package Selenium.syntax.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathusingText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
       WebElement alertlink = driver.findElement(By.xpath("//a[text()='Alerts & Modals']"));
       alertlink.click();
    }
}
