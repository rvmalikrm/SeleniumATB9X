package Apr25;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Lab1Apr25_Window_handels {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.guseducationindia.com/");
        driver.manage().window().maximize();
//        WebElement link=driver.findElement(By.tagName());
        WebElement ele=driver.findElement(By.xpath("//a[normalize-space(text())='Terms Conditions']"));

        JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(400);
        String mainwindow=driver.getWindowHandle();
        String name=ele.getAttribute("href");
        System.out.println(name);
        Thread.sleep(200);
//        js.executeScript(f"window.open('{name}','_blank')");
        js.executeScript("window.open('"+name+"', '_blank')");
        Thread.sleep(400);
        Set<String> windows=driver.getWindowHandles();
        for(String s: windows){
            if(!s.equals(mainwindow)){
                driver.switchTo().window(s);
                Thread.sleep(400);
                String tittle=driver.getTitle();
                Thread.sleep(400);
                System.out.println(tittle);
            }
        }
        driver.switchTo().window(mainwindow);
        Thread.sleep(400);
    }
    }

