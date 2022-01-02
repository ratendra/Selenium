package Selenium.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tablesWithPagination {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://syntaxprojects.com/table-pagination-demo.php");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        //print the row that contains the student name "Archy J"
        //   1.locate the table rows using xpath

        List<WebElement> tableRows= (List<WebElement>) driver.findElement(By.xpath("//table[@class='table table-hover']/tbody/tr"));
              //1.2 locate the next button on the table
        WebElement nxtBtn= (WebElement) driver.findElements(By.xpath("//a[class='next_Link']"));
        //2.Iterate over the list and see if the desired row is there or not
        int i=1;
        boolean Found=true;
        while (!Found) {

            for (WebElement tablerow : tableRows) {

                String textofRow = tablerow.getText();
                if (textofRow.contains("Archy J")) {
                    System.out.println(textofRow);
                    System.out.println(":the page number is:"+i);
                    Found=false;
                    break;

                }
            }
            if(!Found){
                nxtBtn.click();
                i++;
            }
        }
    }
}
