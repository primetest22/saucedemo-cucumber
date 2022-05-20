package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(className = "product_sort_container")
    WebElement hiToLow;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
    WebElement costly;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    WebElement cheap;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
    WebElement cart;

    public void clkOnCart(){
        clickOnElement(cart);
        log.info("Click on cart : " + cart.toString());
    }

    public void addCheapProductToCart(){
        clickOnElement(cheap);
        log.info("Add Sauce Labs Onesie to cart : " + cheap.toString());
    }

    public void addCostlyProductToCart(){
        clickOnElement(costly);
        log.info("Add Sauce Labs Fleece Jacket : " + costly.toString());
    }

    public void sortByHiToLo(String sort){
        selectByVisibleTextFromDropDown(hiToLow,sort);
        log.info("Sort the products with prices high to low : " + hiToLow);
    }


}
