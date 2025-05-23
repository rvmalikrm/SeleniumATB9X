package May25;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Set;
public class Lab15May25_searchFleming {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= new ChromeDriver();
        driver.get("https://www.flemingcollegetoronto.ca/");
        driver.manage().window().maximize();
    }
    @Test
    public void searchFleming() {
        WebElement searchicon = driver.findElement(By.xpath("//a[@aria-label='Search Icon']"));
        searchicon.click();
        WebElement input = driver.findElement(By.name("query"));
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].value='Blog';", input);
        WebElement searcbutton = driver.findElement(By.xpath("//span[normalize-space(text())='Search']"));
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].click();", searcbutton);
        WebElement footer = driver.findElement(By.cssSelector("a[title*='Lifestyle ']"));
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("arguments[0].scrollIntoView(true);", footer);



        String currentwindow= driver.getWindowHandle();
        WebElement link= driver.findElement(By.linkText("Read"));
        //link.click();
        String href= link.getAttribute("href");
        JavascriptExecutor js4=(JavascriptExecutor)driver;
        js4.executeScript("window.open(arguments[0]),'_blank';",href);
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> allwindow= driver.getWindowHandles();
        for(String win: allwindow){
            if(!win.equals(currentwindow)){
                driver.switchTo().window(win);
                break;

            }
        }
        System.out.println("this is the title of new tab"+driver.getTitle());
        //driver.switchTo().defaultContent();
        driver.switchTo().window(currentwindow);
        System.out.println("this is the title old tab "+driver.getTitle());

    }
    @AfterMethod
    public void tearDown()
    {
        //driver.close();
    }
}
