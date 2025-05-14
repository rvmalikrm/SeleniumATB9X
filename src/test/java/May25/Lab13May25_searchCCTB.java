package May25;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab13May25_searchCCTB
{
    WebDriver driver;
    @BeforeMethod
    public void setUp()
    {
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.canadianctb.ca/");
    }
    @Test
    public void hoverCCTB() throws InterruptedException {
        WebElement ele1= driver.findElement(By.xpath("//div[@id='searchform']"));
        ele1.click();
        WebElement ele2 = driver.findElement(By.name("search"));
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.elementToBeClickable(By.name("search"))).click();
        WebDriverWait wait2= new WebDriverWait(driver,Duration.ofSeconds(5000));
        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Search...']"))).click();
        WebDriverWait wait3 =new WebDriverWait(driver,Duration.ofSeconds(2));
        wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@class='search-modal-form__wrapper']"))).click();
        System.out.println("Search field found");
        WebElement ele4= driver.findElement(By.xpath("//input[@placeholder='Search...']"));
//        ele4.click();
        //Actions actions =new Actions(driver);
        //ele4.sendKeys("Blog");
        ele4.sendKeys("Blog");
        ele4.sendKeys(Keys.RETURN);
        driver.findElement(By.xpath("//button[normalize-space(text())='Seach']")).click();

    }
    @AfterMethod
    public void teardown()
    {
        driver.quit();
    }

}
