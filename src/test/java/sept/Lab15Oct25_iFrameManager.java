package sept;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab15Oct25_iFrameManager {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();
        driver.switchTo().frame("SingleFrame"); //SingleFrame
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("This is Manoj Kumar The REAL HERO of Intelegencia");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
        WebElement outerframe=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(outerframe);
        WebElement innerframe=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
        driver.switchTo().frame(innerframe);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("This is Manoj Kumar The REAL HERO of Intelegencia");
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

        driver.findElement(By.xpath("//a[text()='Single Iframe']")).click();

    }
}
