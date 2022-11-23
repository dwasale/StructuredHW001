package com.rudra;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;

public class Utils extends BasePage{

    public void clickOnElement(By by){
        driver.findElement(by).click();
    }

    public String getTextFromSelectedElement(By by){
        return driver.findElement(by).getText();
    }

    public void sendUserInputData(By by, String text){
        driver.findElement(by).sendKeys(text);
    }

    public void selectListByIndexValue(By by, int value){
        Select select = new Select(driver.findElement(by));
        select.deselectByIndex(value);
    }

    public void selectListByVisibleText(By by, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    public void selectListByValue(By by, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }
    public static String dateTimeStamp() {
        return new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date()); // Storing current date and time as given pattern
    }

    public WebElement selectedCurrencyValue(By by){
        Select select = new Select(driver.findElement(by));
        return select.getFirstSelectedOption();
    }

    public boolean isAlertPresent(){
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e){
            return false;
        }
    }

    public void acceptPopUpWindow(){
        driver.switchTo().alert().accept();
    }

    public void webDriverWait( Duration time){
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public String toGetUrlOpenedInNextTab() {
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        return driver.getCurrentUrl();
    }

    public static void takeSnapShot(String screenShotName) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

        File DestFile=new File("src/main/java/Screenshots"+screenShotName+dateTimeStamp()+".jpg");

        //Copy file at destination

        FileUtils.copyFile(SrcFile, DestFile);

    }
}
