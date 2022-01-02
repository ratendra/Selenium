package Selenium.syntax.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args)throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();

       driver.findElements(By.xpath("//input[placeholder='Please enter your Message']"));


        driver.findElement(By.xpath("//a[contains(@id,'btn_b')]")).click();
        Thread.sleep(300);
        driver.findElement(By.xpath("//a[@class='list-group-item'and text()='Simple Form Demo']")).click();
       // driver.findElement(By.xpath())

    }
}

