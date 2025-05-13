package May25;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Lab13May25_hoverOnCCTBMenu
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
        WebElement ele1= driver.findElement(By.xpath("//a[@class='nav-link font-bold-18'][@title='About Us']"));
        Actions action = new Actions(driver);
        action.moveToElement(ele1).build().perform();
        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("arguments[0].style.border='3px solid red'",ele1);
        Thread.sleep(3000);
    }
    @AfterMethod
    public void teardown()
    {
        if(driver!=null)
        driver.quit();
    }

}
