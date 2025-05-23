package May25;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab22May25_iFrame_Practice {
    WebDriver driver;

    @BeforeTest
    public void setUP(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/iframe");
    }
    @Test
    public void testiFrame() throws InterruptedException {
        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframe);
        WebElement editor = driver.findElement(By.xpath("//p[normalize-space(text())='Your content goes here.']"));
        String contentEditable = editor.getAttribute("contenteditable");
        System.out.println("Is Editable: " + contentEditable);  // Should be "true"
        WebElement editor3 = driver.findElement(By.xpath("//p[normalize-space(text())='Your content goes here.']"));
        editor3.click(); // Focus the element
        editor3.sendKeys("My updated content");
        WebElement editor2 = driver.findElement(By.xpath("//p[normalize-space(text())='Your content goes here.']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].innerText='My updated content';", editor2);


//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[normalize-space(text())='Your content goes here.']"))).sendKeys("""
//                Hello Ravi,
//                This is new line,
//                You can add more line below
//                Happy to close this """);

//        WebElement ele = new driver.findElement(By.xpath("//p[normalize-space(text())='Your content goes here.']"));
//        ele.sendKeys("Hello ");



    }
    @AfterTest
    public void tearDown(){
        driver.switchTo().defaultContent();
        driver.quit();
    }
}
