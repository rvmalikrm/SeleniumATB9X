
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.xml.xpath.XPath;
import java.util.List;
import java.util.Set;

import static java.lang.Thread.sleep;

public class Lab27Mar001 {
    public static void main(String[] arg) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
            driver.get("https://www.guru99.com/");
            driver.manage().window().maximize();
            String parent_window=driver.getWindowHandle();
            System.out.println("Parent window tittle is "+ driver.getTitle());
        Thread.sleep(4);
            WebElement link = driver.findElement(By.xpath("//span[normalize-space()='Selenium']"));;
        Thread.sleep(4);
        Actions action =new Actions(driver);
        action.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();

            //link.click();
            Thread.sleep(4);
            Set<String> allwindows=driver.getWindowHandles();
            Thread.sleep(4);
            for(String window : allwindows)
            {
                if(!window.equals(parent_window));
                driver.switchTo().window(window);
                System.out.println("New Opened winddow tittle is "+ driver.getTitle());
                Thread.sleep(4);
                driver.close();
                break;

            }
        Thread.sleep(4);
            driver.quit();
        }
}
