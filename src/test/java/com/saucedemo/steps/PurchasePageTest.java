package com.saucedemo.steps;

import com.saucedemo.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class PurchasePageTest {
    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {
    }

    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String userName, String password)  {
        new LoginPage().enterUserName(userName);
        new LoginPage().enterPassword(password);
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clkOnLogInBtn();
    }

    @And("^I filter the products by Price \"([^\"]*)\"$")
    public void iFilterTheProductsByPrice(String hiToLow)  {
        new HomePage().sortByHiToLo(hiToLow);
    }

    @And("^I select cheapest & costliest products and add to basket$")
    public void iSelectCheapestCostliestProductsAndAddToBasket() {
        new HomePage().addCheapProductToCart();
        new HomePage().addCostlyProductToCart();
    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
        new HomePage().clkOnCart();
    }


    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new CartPage().clkOnCheckoutBtn();
    }

    @And("^I enter details firstname \"([^\"]*)\", lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastNameAndZipPostalCode(String first, String last, String zip)  {
        new CheckoutPage().enterUserName(first);
        new CheckoutPage().enterLastName(last);
        new CheckoutPage().enterZipCode(zip);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckoutPage().clkOnContinueBtn();
    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new CheckoutSecondPage().clkOnFinishBtn();
    }

    @Then("^I should be able to see message 'Thank you for your order'$")
    public void iShouldBeAbleToSeeMessageThankYouForYourOrder() {
        Assert.assertEquals("error","Thank you for your order",
                new CheckoutCompletePage().verifyText());
    }
}
