package May25;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Lab13May25_window_handle_CCTB
{
    WebDriver driver;
    @BeforeMethod
    public void setUp()
    {
        driver =new ChromeDriver();
        driver.manage().window().maximize();;
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.canadianctb.ca/");
    }
    @Test
    public void CCTB_window() throws InterruptedException
    {
        String currentwindow = driver.getWindowHandle();
        WebElement link= driver.findElement(By.linkText("Student Experience"));
        Actions action= new Actions(driver);
        action.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();;
        ArrayList<String> ar =new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(ar.get(1));
        System.out.println(driver.getTitle());
        driver.switchTo().defaultContent();
        driver.close();

    }
    @AfterMethod
    public void teardown(){
       if(driver!=null)

        driver.quit();
    }
}
