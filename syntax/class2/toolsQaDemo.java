package Selenium.syntax.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
8 locators that we have
id
name
tagname
classname
linktext
partiallinktext
xpath
css

 */
public class toolsQaDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");//Launch the browser
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
       WebElement Textbox= driver.findElement(By.className("form-control"));
       Textbox.sendKeys("Ratendra");
    }
}
