package Selenium.syntax.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class driverComand {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://ebay.com");
        //get all the links that are there on ebay.com
        //as we have multiple elements with tags name a so we use driver. findElements
       List<WebElement> links= driver.findElements(By.tagName("a"));

      // print the size of list
        System.out.println("The size of List containing is:"+links.size());


        //print the text of all the links

        for(WebElement link:links){
     //      get the text out of the webElement link
            String linkText=link.getText();

            System.out.println(linkText);

            if(!linkText.isEmpty()){
                System.out.println(linkText);

             String linkAddress=   link.getAttribute("href");
                System.out.println(linkAddress);
            }
        }
    }
}