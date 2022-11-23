package com.rudra;

import org.openqa.selenium.By;
import org.testng.Assert;

public class FaceBook extends Utils{

    private By _facebookLogo = By.linkText("Facebook");

    public void toClickOnFacebookLogo(){
        clickOnElement(_facebookLogo);
    }

    public void toGetUrlAndToVerify(){
        String url = toGetUrlOpenedInNextTab();
        System.out.println(url);
        Assert.assertEquals(url,"https://www.facebook.com/nopCommerce","Expected url is not matching to actual");
    }
}
