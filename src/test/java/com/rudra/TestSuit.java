package com.rudra;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest{

    HomePage homePage = new HomePage();
    CurrencySelector currencySelector = new CurrencySelector();
    NewReleaseComment newReleaseComment = new NewReleaseComment();
    FaceBook faceBook = new FaceBook();
    AppleMacBookPro appleMacBookPro = new AppleMacBookPro();
    RegisterPage registerPage = new RegisterPage();


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

    @Test
    public void toVerifyAlertDisplayAndClickAlertPopUpWindow(){
        //Go to homepage
        //Click on vote without choosing any options
        homePage.toVerifyAlertPopUpWindowAfterClickingVoteButtonWithoutSelectingAny();
        //Check the alert pop up
        homePage.toCheckAlertIsPresent();
        //Accept alert popup window
        homePage.acceptPopUpWindow();
    }

    @Test
    public void toVerifyCommentsOnNewReleaseSectionFromNews(){
        //Go to homepage
        //Click on News new release Details button
        newReleaseComment.toClickOnNewReleaseDetailsButton();
        //Fill in the form
        newReleaseComment.toLeaveACommentInNewReleaseDetails();
        //Check the message after successful adding comment
        newReleaseComment.toVerifyCommentIsAddedSuccessfully();
        //Check your comment is displayed at button
    }

    @Test
    public void toVerifyUrlOpenAfterCLickingOnFaceBook(){
        //HomePage
        //Click on facebook
        faceBook.toClickOnFacebookLogo();
        //Verify facebook url is correct
        faceBook.toGetUrlAndToVerify();
    }

    @Test
    public void toVerifyRegisteredUserShouldBeAbleToReferAMacBookProToAFriend(){
        //Homepage
        //User must be registered and should log in
     //   loginPage.toLoginAsAExistingUser();
        registerPage.toRegisterAsANewUser();
        //Click On MacBook Pro and click on Email a friend And fill the form and send an email
        appleMacBookPro.toEmailAFriendAboutNewAppleMacBookPro();
    }
}
