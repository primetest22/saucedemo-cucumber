package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.commons.logging.Log;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

        public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(id = "user-name")
    WebElement userNameField;

    @CacheLookup
    @FindBy(id = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "login-button")
    WebElement loginButton;

    public void enterUserName(String userName){
        sendTextToElement(userNameField,userName);
        log.info("Enter username : " + userName.toString());
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
        log.info(("Enter password : " + passwordField.toString()));
    }

    public void clkOnLogInBtn(){
        clickOnElement(loginButton);
        log.info("Click on login button : " + loginButton.toString());
    }


    }

