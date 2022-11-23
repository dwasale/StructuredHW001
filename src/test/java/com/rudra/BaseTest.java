package com.rudra;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils{

    DriverManager driverManager = new DriverManager();

    @BeforeMethod
    public void setUp(){
        driverManager.openBrowser();
    }

    @AfterMethod
    public void tearDown(ITestResult result){
        if (!result.isSuccess()){
            try {
                takeSnapShot(result.getName());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        driverManager.closeBrowser();
    }

}
