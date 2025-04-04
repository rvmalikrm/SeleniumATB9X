package Apr25;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;
import java.util.Set;
public class Lab4Apr25_Window_handle_LCCA {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.manage().window().maximize();
        driver.get("https://www.lcca.org.uk/");
        String mainwindow = driver.getWindowHandle();
        WebElement link = driver.findElement(By.xpath("//a[normalize-space(text())='Contact'][1]"));
        System.out.println("link" + link);
        String url = link.getAttribute("href");
        System.out.println(url);
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.open('"+url+"','_blank')");
        js.executeScript("window.open('url', '_blank')");
        System.out.println(url);
        Set<String> allwindows = driver.getWindowHandles();
        Thread.sleep(2000);
        for (String s : allwindows) {
            if (!s.equals(mainwindow)) {
                driver.switchTo().window(s);
                break;
            }
        }
        String title =driver.getTitle();
        System.out.println("Tittle of the opened window is  " +title);

        driver.switchTo().window(mainwindow);
    }
}
