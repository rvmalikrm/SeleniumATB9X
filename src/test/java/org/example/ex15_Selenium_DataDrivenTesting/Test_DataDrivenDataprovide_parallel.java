package org.example.ex15_Selenium_DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_DataDrivenDataprovide_parallel {
    @DataProvider(name = "LoginData" , parallel = true)
    public Object[][] getData() {
        return new Object[][]{
                new Object[]{"admin@gmail.com", "pass123"},
                new Object[]{"admi234n@gmail.com", "pass123"},
                new Object[]{"admin4390@gmail.com", "admin@123"}
        };
    }
        @DataProvider(name = "LoginData2" , parallel = true)
        public Object[][] getData2(){
            return new Object[][]{
                    new Object[]{"admin2@gmail.com", "pass2123"},
                    new Object[] {"admin2234n@gmail.com", "pass2123"},
                    new Object[] {"admin24390@gmail.com", "admin2@123"}
            };
    }

    @Test(dataProvider = "LoginData")
    public void DataDriven(String email, String passwor) {
        System.out.println(email +" | "+ passwor );

    }
    @Test(dataProvider = "LoginData2")
    public void DataDriven2(String email, String passwor) {
        System.out.println(email +" | "+ passwor );

    }
}
