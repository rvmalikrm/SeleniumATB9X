package May25;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab12May25_Scroll_Fleming {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.flemingcollegetoronto.ca/");
        driver.manage().window().maximize();
        WebElement ele1= driver.findElement(By.className("copyrightFooter__content-link"));

        JavascriptExecutor js= (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].scrollIntoView(true);",ele1);
        js.executeScript("window.scrollTo(0, 1000);");

        }
    }

