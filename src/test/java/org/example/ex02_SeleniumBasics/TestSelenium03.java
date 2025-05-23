package org.example.ex02_SeleniumBasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium03 {
    @Test
    public void test_Selenium02(){
        WebDriver driver=new FirefoxDriver();
        driver.navigate().to("https://www.google.com");
    }


}
