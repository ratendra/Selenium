package Selenium.syntax.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com");
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("customer.firstName")).sendKeys("Ratendra");
        driver.findElement(By.id("customer.lastName")).sendKeys("Khand");
        driver.findElement(By.id("customer.address.street")).sendKeys("gjsgajgdjahsgdh123");
        driver.findElement(By.id("customer.address.city")).sendKeys("gotham");
        driver.findElement(By.id("customer.address.state")).sendKeys("sangai");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("11111");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("98282873938");
        driver.findElement(By.name("customer.ssn")).sendKeys("92828836647");
        driver.findElement(By.name("customer.username")).sendKeys("hakunamatata");
        driver.findElement(By.name("customer.password")).sendKeys("makhandalnaparega");
        driver.findElement(By.name("repeatedPassword")).sendKeys("makhandalnaparega");
        driver.findElement(By.className("button")).click();
        driver.quit();

    }
}
