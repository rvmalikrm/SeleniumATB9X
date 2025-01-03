package org.example.ex05_Selenium_Locaters;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium17 {

    @Description("Verify that with invalid email, pass , error message is showing ")
    @Test
    public void test_negative_vwo_login() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("==stage-maximized==");

        WebDriver driver =new EdgeDriver(edgeOptions);
        //driver.navigate().to("https://app.vwo.com/#/login");
        driver.get("https://app.vwo.com/#/login");


        // 1. Find the email input box and enter the email
        WebElement userId =driver.findElement(By.id("login-username"));
        userId.sendKeys("admin@admin.com");

        // 2. Find the password inputbox and enter the password
        WebElement pwd  =driver.findElement(By.id("login-password"));
        pwd.sendKeys("admin");
        // 3. find the submit button and click on it
        WebElement submit = driver.findElement(By.id("js-login-btn"));
        submit.click();
        // 4. find the error message and Verify the error massage
        //Assert("")

    }


}
