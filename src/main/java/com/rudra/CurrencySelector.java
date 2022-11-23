package com.rudra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CurrencySelector extends Utils{

    private By _currency = By.id("customerCurrency");
    private By _getListOfPrice = By.xpath("//span[@class='price actual-price']");
    private By _clickCurrencyList = By.className("currency-selector");

    public void toCheckSelectedCurrencyIsInUSDollar(){
        String selectedCurrency = selectedCurrencyValue(_currency).getText();
        List<WebElement> productPriceList = driver.findElements(_getListOfPrice);
        for (WebElement element: productPriceList){
            String price = element.getText().replaceAll("[0-9.,]","");
            Assert.assertEquals(price,"$","Expected must be in US dollar");
            System.out.println(element.getText());
        }
        System.out.println(selectedCurrency);

    }

    public void toSelectCurrencyInEuro(){
        clickOnElement(_clickCurrencyList);
        selectListByVisibleText(_currency,"Euro");
    }

    public void toCheckSelectedCurrencyIsInEuro(){
        String selectedCurrency = selectedCurrencyValue(_currency).getText();
        List<WebElement> productPriceList = driver.findElements(_getListOfPrice);
        for (WebElement element: productPriceList){
            String price = element.getText().replaceAll("[0-9.,]","");
            Assert.assertEquals(price,"€","Expected must be in Euro");
            System.out.println(element.getText());
        }
        System.out.println(selectedCurrency);
    }
}
