package July25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UTMTracking {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://staging.ucanwest.ca/?utm_source=refer_a_friend&utm_medium=email&utm_campaign=pwApril25&utm_content=98PS4449889978");
        driver.manage().window().maximize();
        List<WebElement> alllinks= driver.findElements(By.tagName("a"));
        int i=0;
        for(WebElement link: alllinks){
            String url= link.getAttribute("href");
            if(url !=null && !url.isEmpty()&& url.contains("staging")){
                    System.out.println(i+1+" "+url);
                    i++;
            }
        }
    }
}
