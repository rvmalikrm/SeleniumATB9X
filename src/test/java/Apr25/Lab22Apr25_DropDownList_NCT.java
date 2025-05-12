package Apr25;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class Lab22Apr25_DropDownList_NCT {
    public static void main(String[] args){
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.niagaracollegetoronto.ca/");
        String Tittle=driver.getTitle();
        System.out.println(Tittle);
        WebElement ele=driver.findElement(By.xpath("//a[@aria-label=\"Enquire Now, on click a form will pop-up\"]"));
        ele.click();

        WebDriverWait waitforcode=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement code=waitforcode.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("select.jForm__input.no-outline")));

//        Select optionforcode =new Select(code);
//        optionforcode.selectByIndex(8);
        // This is for Listing out all the dropdown option to  print all dropdown options
        Select selectoptioncode =new Select(code);
        List<WebElement> codeoptions = selectoptioncode.getOptions();
        int count=1;
        for (WebElement option : codeoptions) {
            System.out.println(count +" "+option.getText());
            count++;
        }

//        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement ele3=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("select.jForm__input.no-outline")));
//        // This is for Listing out all the dropdown option to  print all dropdown options
//        Select selectoption =new Select(ele3);
//        List<WebElement> options = selectoption.getOptions();
//        for (WebElement option : options) {
//            System.out.println(option.getText());
//        }

//        selectoption.selectByIndex(8);

        System.out.println("DropDown Selected");
    }
}
