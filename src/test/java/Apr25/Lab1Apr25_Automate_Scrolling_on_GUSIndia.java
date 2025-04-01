package Apr25;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab1Apr25_Automate_Scrolling_on_GUSIndia {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.guseducationindia.com/");
        driver.manage().window().maximize();
        WebElement footer=driver.findElement(By.xpath("//a[normalize-space(text())='Terms Conditions']"));
        JavascriptExecutor js= (JavascriptExecutor) driver;
        System.out.println(footer);
//        Method 1 using window.scrollTo(0,document,body.scrollHeight
//        js.executeScript("window.scrollTo(0,document.body.scrollHeight/2)");
//        Thread.sleep(500);
//        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//        Methos 2 using arguments[0].scrollIntoView(true);", WebElement
        js.executeScript("arguments[0].scrollIntoView(true);",footer);
}
    }