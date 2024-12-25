package org.example.ex02_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class TestSelenium02 {
    @Test
    public void test_Selenium02(){
    WebDriver driver=new ChromeDriver();
    driver.navigate().to("https://www.google.com");
    }
}
