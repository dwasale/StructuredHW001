package com.rudra;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewReleaseComment extends Utils{

    private By _clickDetailsButton = By.xpath("//div[@class='news-item'][2]/div[3]");
    private By _titleForComment = By.name("AddNewComment.CommentTitle");
    private By _messageComment = By.name("AddNewComment.CommentText");
    private By _addComment = By.name("add-comment");
    private By _getMessage = By.className("result");

    public void toClickOnNewReleaseDetailsButton(){
        clickOnElement(_clickDetailsButton);
    }

    public void toLeaveACommentInNewReleaseDetails(){
        sendUserInputData(_titleForComment,"TestABC");
        sendUserInputData(_messageComment,"Comment test123 for ABC");
        clickOnElement(_addComment);
    }

    public void toVerifyCommentIsAddedSuccessfully(){
        String message = getTextFromSelectedElement(_getMessage);
        Assert.assertEquals(message,"News comment is successfully added.","Expected message is incorrect");
    }
}
