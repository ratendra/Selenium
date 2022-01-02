package Selenium.syntax.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

        WebElement singleCheckBox=driver.findElement(By.cssSelector("input#isAgeSelected"));
        singleCheckBox.click();
       // Thread.sleep(2000);

        singleCheckBox.click();

      //  List<WebElement> checkBoxes = driver.findElement(By.xpath());
    }
}
