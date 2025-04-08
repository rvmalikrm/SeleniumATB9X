package Apr25;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab7Apr25_DropandDown_Lat {
    public static void main(String[] args){
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lat.london/");
        String Tittle=driver.getTitle();
        System.out.println(Tittle);
        WebElement ele=driver.findElement(By.cssSelector("form div div button[type='submit']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);",ele);


    }
}
