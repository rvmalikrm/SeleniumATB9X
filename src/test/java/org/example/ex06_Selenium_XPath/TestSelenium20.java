package org.example.ex06_Selenium_XPath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium20 {

    @Description("Verify that with invalid email, pass , error message is showing ")
    @Test
    public void test_login_Cura() throws Exception,AssertionError {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--stage-maximized");

        WebDriver driver =new EdgeDriver(edgeOptions);
        //driver.navigate().to("https://app.vwo.com/#/login");
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement make = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        make.click();
        WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username'][1]"));
        username.sendKeys("John Dee");
        WebElement pwd = driver.findElement(By.xpath("//input[@placeholder='Password'][1]"));
        pwd.sendKeys("ThisisnotPassword");

        WebElement button = driver.findElement(By.xpath("//button[@id='btn-login']"));
        button.click();




           }


}
