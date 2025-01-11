package org.example.ex15_Selenium_DataDrivenTesting;

import org.openqa.selenium.json.JsonOutput;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_DataDrivenDataprovider {
    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                new Object[]{"admin@gmail.com", "pass123"},
                new Object[] {"admi234n@gmail.com", "pass123"}
        };
    }

    @Test(dataProvider = "getData")
    public void DataDriven(String email, String passwor) {
        System.out.println(email +" | "+ passwor );

    }
}
