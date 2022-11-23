package com.rudra;

import org.openqa.selenium.By;

public class LoginPage extends Utils{

    private By _loginPage = By.className("ico-login");
    private By _sendEmail = By.name("Email");
    private By _sendPassword = By.name("Password");
    private By _clickOnLogin = By.xpath("//button[@class='button-1 login-button']");

    public void toLoginAsAExistingUser(){
        clickOnElement(_loginPage);
        sendUserInputData(_sendEmail,"unqtest29@maventest.com");
        sendUserInputData(_sendPassword,"abc1234");
        clickOnElement(_clickOnLogin);

    }
}
