package May25;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
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
        JavascriptExecutor js= (JavascriptExecutor)driver;
        WebElement searhele= driver.findElement(By.xpath("//form[@class='search-modal-form__wrapper']/div/input"));
        js.executeScript("arguments[0].click();",searhele);
        System.out.println("clik success");
        WebElement searhele2= driver.findElement(By.xpath("//form[@class='search-modal-form__wrapper']/div/input"));
        JavascriptExecutor js2 =(JavascriptExecutor)driver;
        js2.executeScript("arguments[0].value='Blog';",searhele2);
        System.out.println("Locate success");
        WebElement searcbutton= driver.findElement(By.xpath("//button[normalize-space(text())='Seach']"));
        JavascriptExecutor js3 =(JavascriptExecutor) driver;
        js3.executeScript("arguments[0].click();",searcbutton);
        WebElement footer= driver.findElement(By.xpath("//strong[normalize-space(text())='Others']"));
        JavascriptExecutor js4=(JavascriptExecutor) driver;
//        js4.executeScript("arguments[0].scrollIntoView();",footer);
        js4.executeScript("window.scrollTo(0,1000);");

    }
    @AfterMethod
    public void teardown()
    {

    }
}
