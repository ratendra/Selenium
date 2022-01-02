package Selenium.syntax;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");//Launch the browser
        WebDriver driver=new ChromeDriver(); //nagivate to specified url
        driver.get("https://www.google.com/");
    }
}

