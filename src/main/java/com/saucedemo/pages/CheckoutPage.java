package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends Utility {

    private static final Logger log = LogManager.getLogger(CheckoutPage.class.getName());

    public CheckoutPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='first-name']")
    WebElement userName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement zipcode;

    @CacheLookup
    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueBtn;

    public void clkOnContinueBtn(){
        clickOnElement(continueBtn);
        log.info("Click on continue button : " + continueBtn);
    }

    public void enterZipCode(String zip){
        sendTextToElement(zipcode,zip);
        log.info("Enter zipcode : " + zipcode.toString());
    }

    public void enterLastName(String lastname){
        sendTextToElement(lastName,lastname);
        log.info("Enter lastname : " + lastname.toString());
    }

    public void enterUserName(String user){
        sendTextToElement(userName,user);
        log.info("Enter username : " + userName.toString());
    }
}
