package com.rudra;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager extends Utils {

    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver");
        driver = new ChromeDriver();
        String url = "https://demo.nopcommerce.com/";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public void closeBrowser(){
        driver.quit();
    }
}
