package com.rudra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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

    public WebElement selectedCurrencyValue(By by){
        Select select = new Select(driver.findElement(by));
        return select.getFirstSelectedOption();
    }
}
