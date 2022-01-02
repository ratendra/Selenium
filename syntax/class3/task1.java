package Selenium.syntax.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://syntaxprojects.com/");

        driver.manage().window().maximize();


        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='list-group-item' and text()='Simple Form Demo']")).click();
         driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Ratendra");
         driver.findElement(By.xpath("//button[text()='Show Message']")).click();
    }
}
