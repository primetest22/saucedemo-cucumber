package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutSecondPage extends Utility {

    private static final Logger log = LogManager.getLogger(CheckoutSecondPage.class.getName());

    public CheckoutSecondPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishBtn;

    public void clkOnFinishBtn(){
        clickOnElement(finishBtn);
        log.info("Click on finish button : " + finishBtn.toString());
    }

}
