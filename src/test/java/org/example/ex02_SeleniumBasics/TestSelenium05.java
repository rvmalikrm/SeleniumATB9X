package org.example.ex02_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium05 {
    @Test
    public void test_Selenium04(){
        WebDriver driver =new FirefoxDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
    }
}
