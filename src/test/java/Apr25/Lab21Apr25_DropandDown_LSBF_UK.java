package Apr25;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.
import java.time.Duration;
TimeoutException
import java.util.List;

public class Lab21Apr25_DropandDown_LSBF_UK {
    public static void main(String[] args){
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lsbf.org.uk/");
        String Tittle=driver.getTitle();
        System.out.println(Tittle);
        // CssSelector for Enquire Now =
        // body > nav:nth-child(5) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)
        // Xpath
        // //ul[contains(@class,'nav__list')]//a[contains(@class,'nav__link--bgred open-enquire-form')][normalize-space()='Enquire Now']
        WebElement ele=driver.findElement(By.cssSelector("body > nav:nth-child(5) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)"));
        ele.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ele3=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@id='Programme__cm9qrhketm3l5seslnm']")));

//        WebElement dropele=driver.findElement(By.xpath("//select[@id='Programme__cm9qrhketm3l5seslnm']"));
        Select option =new Select(ele3);
        option.selectByIndex(2);
        System.out.println("Hi");



    }
}
