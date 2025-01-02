package org.example.ex05_Selenium_Locaters;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium17 {

    @Description("Verify that with invalid email Id , pass , error message is showing ")
    @Test
    public void test_negative_vwo_login() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("==stage-maximized==");

        WebDriver driver =new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com/#/login");

    }


}
