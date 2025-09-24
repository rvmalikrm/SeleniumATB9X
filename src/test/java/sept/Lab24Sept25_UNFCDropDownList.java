package sept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Lab24Sept25_UNFCDropDownList {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://refundsweb-stage.azurewebsites.net/");
        driver.manage().window().maximize();
        WebElement ele1=driver.findElement(By.xpath("//select[@id='requestType']"));
        //List<WebElement> ele1=driver.findElements(By.tagName("options"));
        Select sel=new Select(ele1);
        List<WebElement> alloptions=sel.getOptions();
        int size=alloptions.size();
        System.out.println(size);
        for(WebElement option:alloptions){
            System.out.println(option.getText());
        }
    }
}
