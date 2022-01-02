package Selenium.syntax.class6;

import com.sun.java.swing.plaf.windows.resources.windows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.text.html.Option;
import java.sql.Driver;
import java.util.List;

public class task {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        driver.manage().window().maximize();

       WebElement days= driver.findElement(By.cssSelector("select#select-demo"));

       Select select=new Select(days);

    // select.selectByValue("Sunday");
      //  select.selectByIndex(2);
        select.selectByVisibleText("Wednesday");

        List<WebElement>allOption =select.getOptions();
        int Size= allOption.size();
        System.out.println(Size);

        //iterate through list all options and get the text of each option

        for (int i=0; i<Size; i++){

        String  optionText =  allOption.get(i).getText();
            System.out.println(optionText);
        }
















    }
}
