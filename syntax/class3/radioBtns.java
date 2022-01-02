package Selenium.syntax.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioBtns {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement femaleRadioBtn=driver.findElement(By.xpath("//input[@value='Female'][@name='optradio']"));
        //femaleRadioBtn.click();

        boolean displayed =femaleRadioBtn.isDisplayed();
        System.out.println(" The  famale radio  Btn is displayed on the webpage : " +displayed);
        boolean isEnabled=femaleRadioBtn.isEnabled();
        System.out.println(" The famele radio Btn is Enabled on the webpage :" +isEnabled);

        boolean isSelected=femaleRadioBtn.isSelected();
        System.out.println("the famale radio Btn is  Selected on the webpage :" +isSelected);

        if(isEnabled){
            femaleRadioBtn.click();
        }
        isSelected=femaleRadioBtn.isSelected();
        System.out.println("the famale radio Btn is  Selected on the webpage : " +isSelected);

    }
}