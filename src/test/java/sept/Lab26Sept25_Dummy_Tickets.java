package sept;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;
public class Lab26Sept25_Dummy_Tickets {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://dummy-tickets.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Both']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ele1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@name='source[]'])[4]")));
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].click();", ele1);
        ele1.sendKeys("Delhi");
        WebElement ele2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='DEL']")));
        ele2.click();
        WebElement ele3=driver.findElement(By.xpath("(//input[@name='destination[]'])[4]"));
        ele3.sendKeys("Mumba");
        WebElement ele4=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='BOM']")));
        ele4.click();
    }
}
