package org.example.ex01_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {
    @Test
    public void test_Selenium01(){
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.google.com");

    }

}
