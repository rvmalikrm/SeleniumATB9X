package May25;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab22May25_iFrame_DemoQA {
    WebDriver driver;

    @BeforeTest
    public void setUP(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");
    }
    @Test
    public void testiFrame() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("frame1")));
        //driver.switchTo().frame(iframe);
        WebElement editor = driver.findElement(By.id("sampleHeading"));
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait2.until(ExpectedConditions.presenceOfElementLocated(By.id("sampleHeading")));
        String headingText = editor.getText();
        System.out.println("Heading text inside iframe: " + headingText);
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('sampleHeading').innerText = 'Changed by Selenium';");
    }
    @AfterTest
    public void tearDown(){
        driver.switchTo().defaultContent();
        driver.quit();
    }
}
