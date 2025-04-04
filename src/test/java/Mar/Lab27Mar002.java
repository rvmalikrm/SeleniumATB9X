package Mar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Lab27Mar002 {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");
        driver.manage().window().maximize();;
        WebElement ele1= driver.findElement(By.cssSelector("div [class='figure']:nth-of-type(2)"));
        Actions action=new Actions(driver);
        action.moveToElement(ele1).build().perform();
        Thread.sleep(4000);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3));
                driver.findElement(By.cssSelector("a[href='/users/2']"));

        WebElement ele=driver.findElement(By.cssSelector("a[href='/users/2']"));

        Thread.sleep(4000);



    }
    }

