package com.rudra;

import org.openqa.selenium.By;

public class RegisterPage extends Utils{
    private By _registerLinkButton = By.className("ico-register");
    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _clickRegisterButton = By.id("register-button");
    private By _homePage = By.xpath("//img[@alt=\"nopCommerce demo store\"]");


    public void toRegisterAsANewUser() {
        clickOnElement(_registerLinkButton);// Uniquely identify the element within the web page and perform given action
        sendUserInputData(_firstName,"UnQTest29");  // It identifies the unique element by id and fill in FirstName field with "Test"
        sendUserInputData(_lastName, "UnQAuto29"); // It identifies the unique element by id and fill in LastName field with "TestAuto"
        sendUserInputData(_email, "unqtest29"+dateTimeStamp()+"@maventest.com");// Identifies unique element by id and fill it with given user inputs - timeStamp is used in between so everytime we test it will be unique and accepts the data
        sendUserInputData(_password, "abc1234");  // Identifies the unique element by id and fill the Password field with "abc1234"
        sendUserInputData(_confirmPassword, "abc1234"); // Identifies the unique element by id and fill the ConfirmPassword field with "abc1234" with should be same as above
        clickOnElement(_clickRegisterButton); // Identifies unique element by id and click the Register button

        String message = getTextFromSelectedElement(By.className("result"));  // It stores the value of result in 'message' String variables
        System.out.println(message);    // It prints out stored message variables

        clickOnElement(_homePage);
    }
}
