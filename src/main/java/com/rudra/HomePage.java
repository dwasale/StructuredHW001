package com.rudra;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Utils{

    private By _voteButton = By.id("vote-poll-1");
    private By _logo = By.linkText("nopCommerce demo store");

    //To check the correct url
    public void toVerifyBrowserHasCorrectURL(){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL,"https://demo.nopcommerce.com/","Url didn't match");
        System.out.println(URL);
    }

    public void toVerifyAlertPopUpWindowAfterClickingVoteButtonWithoutSelectingAny(){
        clickOnElement(_voteButton);
    }

    public void toCheckAlertIsPresent(){
        Assert.assertTrue(isAlertPresent(),"Alert popup window is present");
    }
}
