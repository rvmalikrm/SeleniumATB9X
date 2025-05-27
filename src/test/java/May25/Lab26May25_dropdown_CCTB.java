package May25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Lab26May25_dropdown_CCTB {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.canadianctb.ca/");
    }
    @Test(priority = 1)
    public void testCCTBCountry() {
        WebDriverWait waitcon = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitcon.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a span svg[class^='svg-inlin']"))).click();
        WebDriverWait wait2con = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait2con.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("select[aria-label='Country']")));
        WebElement Contry = driver.findElement(By.cssSelector("select[aria-label='Country']"));
        Select select = new Select(Contry);
        List<WebElement> alloptions = select.getOptions();
        for (WebElement s : alloptions) {
            System.out.println("This is the Contry   ---   " + s.getText());
        }
    }
        @Test(priority = 2)
        public void testCCTBCourse()
    {
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a span svg[class^='svg-inlin']"))).click();
        WebDriverWait wait2= new WebDriverWait(driver, Duration.ofSeconds(10));
        wait2.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("select[id^='Program']")));
        WebElement dropdown= driver.findElement(By.cssSelector("select[id^='Program']"));
        Select selectcon = new Select(dropdown);
        List<WebElement> alloptionscontry=selectcon.getOptions();
        for(WebElement con:alloptionscontry) {
            System.out.println("This is the course   ---   "+con.getText());
        }
    }
}
