package Apr25;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Lab08Apr25_Dropdown
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.silentOutput", "true");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lat.london/");
        WebElement ele2=driver.findElement(By.xpath("//a[text()='COURSES']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);",ele2);
    }
}

