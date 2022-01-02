package Selenium.syntax.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
absolute and relative xpath are two kinds of xpath.
relative:
1.inspecting using attributes
//tagname[@attribute='attribute value']
2.inspecting using text
//tagname[text()='text']

3.identify by using contain method:
//tagname[contains@attribute,'attribute value')]
//input[contains(text(),'partial text')]

Example:
<input class="form",id="form0">
//input[contains(@id,'form')]

4.identify using starts-with method:
will identify the elements with the starting partial value
//tagname[starts-with(@attribute,'partial starting value')]
//tagname[starts with (text(),'')]

topic advance xpath

based upon parent child relationship
//tagname[@attribute='attribute value'/following-sibling::tagname


 */
public class xpath {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        WebElement createNewAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
         createNewAccount.click();

    }
}
