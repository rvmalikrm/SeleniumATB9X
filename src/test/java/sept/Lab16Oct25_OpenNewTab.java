package sept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;

public class Lab16Oct25_OpenNewTab {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lsbf.org.uk/");
        driver.manage().window().maximize();
        String originalHandle = driver.getWindowHandle();
        WebElement link = driver.findElement(By.xpath("(//a[normalize-space(text())='E-Shop'])[1]"));
        String href = link.getDomProperty("href");
        System.out.println("This will open in new tab: " + href);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(link));
        link.click();

        // Use JavascriptExecutor to open the link in a new tab
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.open(arguments[0], '_blank');", href);

        // Wait until a new window/tab is present
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        // Switch to the newly opened tab
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                driver.switchTo().window(handle);
                System.out.println("New tab title: " + driver.getTitle());
                break;
            }
        }
        driver.switchTo().window(originalHandle);
        System.out.println("Original tab title: " + driver.getTitle());


        // ...perform actions on the new tab if needed...
    }
}
