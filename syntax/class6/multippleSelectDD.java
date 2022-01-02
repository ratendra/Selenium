package Selenium.syntax.class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multippleSelectDD {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

        //find the element dropDown
        WebElement statesDD=driver.findElement(By.cssSelector("select#multi-select"));

       //we can use select class so we will make an object of select class
        Select select=new Select(statesDD);

        //check if the drop down is multiple
        boolean ismul= select.isMultiple();
        System.out.println(ismul);

        select.selectByIndex(2);

        Thread.sleep(200);

        select.selectByVisibleText("Florida");

        Thread.sleep(2000);

        select.selectByValue("Ohio");

        Thread.sleep(2000);

        select.deselectByIndex(2);

        Thread.sleep(2000);

        select.deselectByValue("Ohio");

        Thread.sleep(2000);

        select.deselectByVisibleText("Florida");







    }
}
