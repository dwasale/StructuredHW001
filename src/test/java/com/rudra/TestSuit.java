package com.rudra;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest{

    HomePage homePage = new HomePage();
    CurrencySelector currencySelector = new CurrencySelector();

    @Test
    public void toGoToTheNopeCommerceDemoWebsiteAndClose(){
        //Opening the browser and closing
        homePage.toVerifyBrowserHasCorrectURL();
    }

    @Test
    public void toVerifyTheCurrencyHasCorrectCurrencySymbolOfUSDollar(){
        //Be at homepage
        //Compare the price with correct currency symbol of auto selected currency (US Dollar)
        currencySelector.toCheckSelectedCurrencyIsInUSDollar();

    }

    @Test
    public void toVerifyTheCurrencyHasCorrectCurrencySymbolOfEuro() {
        //Select euro
        currencySelector.toSelectCurrencyInEuro();
        //Compare the price with correct currency symbol of Euro
        currencySelector.toCheckSelectedCurrencyIsInEuro();
    }
}
