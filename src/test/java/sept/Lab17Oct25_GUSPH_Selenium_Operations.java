package sept;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Lab17Oct25_GUSPH_Selenium_Operations {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.gusphilippines.com/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//h4[text()='Contact:']"));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(element));
        //element.click();
        System.out.println("Clicked on Contact Us");
        WebElement ele2=driver.findElement(By.xpath("//a[text()='Privacy Policy']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click(),'_blank';", ele2);



    }
}
